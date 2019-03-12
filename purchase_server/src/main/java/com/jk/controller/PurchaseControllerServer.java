package com.jk.controller;

import com.jk.mapper.PurchaseMapper;
import com.jk.pojo.PurchaseOrder;
import com.jk.pojo.ShoppingCart;
import com.jk.pojo.SupplierDrugs;
import com.jk.service.PurchaseServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class PurchaseControllerServer implements PurchaseServiceApi {
    @Autowired
    private PurchaseMapper purchaseMapper;

    @Override
    @GetMapping("querySupplierDrugs")
    public HashMap<String, Object> querySupplierDrugs(Integer page,Integer rows, @RequestBody SupplierDrugs supplierDrugs) {
        HashMap<String, Object> map = new HashMap<>();
        int total = purchaseMapper.querySupplierDrugsCount(supplierDrugs); //总条数
        int start = (page-1)*rows;             //开始条数
        List<SupplierDrugs> list = purchaseMapper.querySupplierDrugsPage(start,rows,supplierDrugs);
        map.put("total", total);
        map.put("rows", list);
        return map;
    }

    @Override
    @RequestMapping("querySuppliers")
    public List<SupplierDrugs> querySuppliers() {
        return purchaseMapper.querySuppliers();
    }

    @Override
    @GetMapping("queryShoppingCart")
    public HashMap<String, Object> queryShoppingCart(Integer page, Integer rows,@RequestBody ShoppingCart shoppingCart) {
        HashMap<String, Object> map = new HashMap<>();
        int total = purchaseMapper.queryShoppingCartCount(shoppingCart); //总条数
        int start = (page-1)*rows;             //开始条数
        List<SupplierDrugs> list = purchaseMapper.queryShoppingCartPage(start,rows,shoppingCart);
        map.put("total", total);
        map.put("rows", list);
        return map;
    }

    @Override
    @RequestMapping("queryPurchaseOrder")
    public List<PurchaseOrder> queryPurchaseOrder(@RequestBody PurchaseOrder purchaseOrder) {
        return purchaseMapper.queryPurchaseOrder(purchaseOrder);
    }


    @Override
    @RequestMapping("queryToCart")
    public SupplierDrugs queryToCart(Integer id) {
        return purchaseMapper.queryToCart(id);
    }

    @Override
    @RequestMapping("addToCart")
    public void addToCart(@RequestBody ShoppingCart shoppingCart) {
        purchaseMapper.addToCart(shoppingCart);
    }


}
