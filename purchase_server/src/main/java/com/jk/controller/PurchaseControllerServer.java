package com.jk.controller;

import com.jk.pojo.Classification;
import com.jk.pojo.PurchaseOrder;
import com.jk.pojo.ShoppingCart;
import com.jk.pojo.SupplierDrugs;
import com.jk.service.PurchaseServerService;
import com.jk.service.PurchaseServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class PurchaseControllerServer implements PurchaseServiceApi {

    @Autowired
    private PurchaseServerService purchaseServerService;

    @Override
    @RequestMapping("querySupplierDrugs")
    public HashMap<String, Object> querySupplierDrugs(Integer page,Integer rows, @RequestBody SupplierDrugs supplierDrugs) {
        return purchaseServerService.querySupplierDrugs(page,rows,supplierDrugs);
    }

    @Override
    @RequestMapping("querySuppliers")
    public List<SupplierDrugs> querySuppliers() {
        return purchaseServerService.querySuppliers();
    }

    @Override
    @RequestMapping("queryConsumption")
    public List<ShoppingCart> queryConsumption() {
        return purchaseServerService.queryConsumption();
    }

    @Override
    @RequestMapping("queryShoppingCart")
    public HashMap<String, Object> queryShoppingCart(Integer page, Integer rows,@RequestBody ShoppingCart shoppingCart) {
        return purchaseServerService.queryShoppingCart(page,rows,shoppingCart);
    }

    @Override
    @RequestMapping("queryPurchaseOrder")
    public HashMap<String, Object> queryPurchaseOrder(Integer page, Integer rows,@RequestBody PurchaseOrder purchaseOrder) {
        return purchaseServerService.queryPurchaseOrder(page,rows,purchaseOrder);
    }


    @Override
    @RequestMapping("queryToCart")
    public SupplierDrugs queryToCart(Integer id) {
        return purchaseServerService.queryToCart(id);
    }

    @Override
    @RequestMapping("addToCart")
    public void addToCart(@RequestBody ShoppingCart shoppingCart) {
        purchaseServerService.addToCart(shoppingCart);
    }

    @Override
    @RequestMapping("updateSupplierDrugs")
    public void updateSupplierDrugs(Integer id, Integer boxCount) {
        purchaseServerService.updateSupplierDrugs(id,boxCount);
    }

    @Override
    @RequestMapping("addPurchaseOrder")
    public void addPurchaseOrder(@RequestBody PurchaseOrder purchaseOrder) {
        purchaseServerService.addPurchaseOrder(purchaseOrder);
    }

    @Override
    @RequestMapping("queryOrderManufacturer")
    public List<PurchaseOrder> queryOrderManufacturer() {
        return purchaseServerService.queryOrderManufacturer();
    }

    @Override
    @RequestMapping("deleteOrder")
    public void deleteOrder(Integer id) {
        purchaseServerService.deleteOrder(id);
    }

    @Override
    @RequestMapping("searchBig")
    public List<Classification> searchBig() {
        return purchaseServerService.searchBig();
    }

    @Override
    @RequestMapping("searchSmall")
    public List<Classification> searchSmall(Integer id) {
        return purchaseServerService.searchSmall(id);
    }

    @Override
    @RequestMapping("searchMinimum")
    public List<Classification> searchMinimum(Integer id) {
        return purchaseServerService.searchMinimum(id);
    }


}
