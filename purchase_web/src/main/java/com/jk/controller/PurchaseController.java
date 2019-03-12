package com.jk.controller;

import com.jk.pojo.PurchaseOrder;
import com.jk.pojo.ShoppingCart;
import com.jk.pojo.SupplierDrugs;
import com.jk.service.PurchaseServiceWeb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

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
    @GetMapping("querySupplierDrugs")
    @ResponseBody
    public HashMap<String, Object> querySupplierDrugs(@RequestParam("page") Integer page, @RequestParam("rows")Integer rows, @RequestBody SupplierDrugs supplierDrugs){
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
     * 查询购物车列表
     * @param page
     * @param rows
     * @param shoppingCart
     * @return
     */
    @GetMapping("queryShoppingCart")
    @ResponseBody
    public HashMap<String, Object> queryShoppingCart(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows,@RequestBody ShoppingCart shoppingCart){
        return purchaseServiceWeb.queryShoppingCart(page,rows,shoppingCart);
    }

    /**
     * 采购订单查询
     * @param purchaseOrder
     * @return
     */
    @RequestMapping("queryPurchaseOrder")
    @ResponseBody
    public List<PurchaseOrder> queryPurchaseOrder(@RequestBody PurchaseOrder purchaseOrder){
        return purchaseServiceWeb.queryPurchaseOrder(purchaseOrder);
    }

    @RequestMapping("addToCart")
    @ResponseBody
    public Boolean addToCart(Integer id,Integer boxCount){
        SupplierDrugs supplierDrugs = purchaseServiceWeb.queryToCart(id);
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setCount(boxCount);
        shoppingCart.setName(supplierDrugs.getDrugName());
        shoppingCart.setUnitPrice(supplierDrugs.getPurchasePrice());
        shoppingCart.setSubtotal(boxCount*supplierDrugs.getPurchasePrice());
        shoppingCart.setSpecifications(supplierDrugs.getSpecifications());
        purchaseServiceWeb.addToCart(shoppingCart);
        return true;
    }

}
