package com.jk.controller;

import com.jk.pojo.PurchaseOrder;
import com.jk.pojo.ShoppingCart;
import com.jk.pojo.SupplierDrugs;
import com.jk.service.PurchaseServiceWeb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Controller
//@RequestMapping("select")
public class PurchaseController {
    @Autowired
    private PurchaseServiceWeb purchaseServiceWeb;

    /**
     *到快速采购页面
     * @return
     */
    @RequestMapping("toQuickPurchaseList")
    public String toQuickPurchaseList(){
        return "quickPurchaseList";
    }
    /**
     *到购物车页面
     * @return
     */
    @RequestMapping("toQueryShoppingCart")
    public String toQueryShoppingCart(){
        return "queryShoppingCartList";
    }

    /**
     *到采购订单页面
     * @return
     */
    @RequestMapping("toQueryPurchaseOrder")
    public String toQueryPurchaseOrder(){
        return "queryPurchaseOrderList";
    }

    /**
     * 查询快速采购列表
     * @param page
     * @param rows
     * @param supplierDrugs
     * @return
     */
    @RequestMapping("querySupplierDrugs")
    @ResponseBody
    public HashMap<String, Object> querySupplierDrugs(Integer page, Integer rows, SupplierDrugs supplierDrugs){
        return purchaseServiceWeb.querySupplierDrugs(page,rows,supplierDrugs);
    }

    /**
     * 查询供应商做条件查询
     * @return
     */
    @RequestMapping("querySuppliers")
    @ResponseBody
    public List<SupplierDrugs> querySuppliers(){
        return purchaseServiceWeb.querySuppliers();
    }
    /**
     * 查询采购订单供应商
     * @return
     */
    @RequestMapping("queryOrderManufacturer")
    @ResponseBody
    public List<PurchaseOrder> queryOrderManufacturer(){
        return purchaseServiceWeb.queryOrderManufacturer();
    }

    /**
     * 查询出所有金额
     * @return
     */
    @RequestMapping("queryConsumption")
    @ResponseBody
    public List<ShoppingCart> queryConsumption(){
        return purchaseServiceWeb.queryConsumption();
    }
    /**
     * 查询购物车列表
     * @param page
     * @param rows
     * @param shoppingCart
     * @return
     */
    @RequestMapping("queryShoppingCart")
    @ResponseBody
    public HashMap<String, Object> queryShoppingCart(Integer page, Integer rows, ShoppingCart shoppingCart){
        return purchaseServiceWeb.queryShoppingCart(page,rows,shoppingCart);
    }

    /**
     * 删除购物车的信息
     * @param id
     * @return
     */
    @RequestMapping("deleteOrder")
    @ResponseBody
    public Boolean deleteOrder(Integer id){
        purchaseServiceWeb.deleteOrder(id);
        return true;
    }
    /**
     * 采购订单查询
     * @param purchaseOrder
     * @return
     */
    @RequestMapping("queryPurchaseOrder")
    @ResponseBody
    public List<PurchaseOrder> queryPurchaseOrder(PurchaseOrder purchaseOrder){
        return purchaseServiceWeb.queryPurchaseOrder(purchaseOrder);
    }

    /**
     * 加入购物车
     * 加入采购订单
     * @param id
     * @param boxCount
     * @return
     */
    @RequestMapping("addToCart")
    @ResponseBody
    public Boolean addToCart(Integer id,Integer boxCount){
        SupplierDrugs supplierDrugs = purchaseServiceWeb.queryToCart(id);//根据id回显对应的商品信息
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setCount(boxCount);//数量
        shoppingCart.setName(supplierDrugs.getDrugName());//商品名称
        shoppingCart.setUnitPrice(supplierDrugs.getPurchasePrice());//单价
        shoppingCart.setSubtotal(boxCount*supplierDrugs.getPurchasePrice());//小计
        shoppingCart.setSpecifications(supplierDrugs.getSpecifications());//规格
        purchaseServiceWeb.addToCart(shoppingCart);         //加入购物车
        purchaseServiceWeb.updateSupplierDrugs(id,boxCount);//修改商品库存

        //uuid
        int machineId = 1;
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        if(hashCodeV < 0) {
            hashCodeV = - hashCodeV;
        }
        String str = new SimpleDateFormat("yyyyMMdd").format(new Date())+machineId + String.format("%012d", hashCodeV);

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.setOrderTime(new Date());//时间
        purchaseOrder.setOrderNumber(str);//订单号
        purchaseOrder.setManufacturer(supplierDrugs.getManufacturer());//生产厂家
        purchaseOrder.setName(supplierDrugs.getDrugName());//商品名称
        purchaseOrder.setUnitPrice(supplierDrugs.getPurchasePrice());//单价
        purchaseOrder.setCount(boxCount);//数量
        purchaseOrder.setActualPayment(boxCount*supplierDrugs.getPurchasePrice());//实付款
        purchaseOrder.setStatus(1);//状态
        purchaseServiceWeb.addPurchaseOrder(purchaseOrder);//加入采购订单
        return true;
    }

}
