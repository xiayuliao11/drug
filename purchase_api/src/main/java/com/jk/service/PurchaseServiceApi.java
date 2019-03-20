package com.jk.service;

import com.jk.pojo.Classification;
import com.jk.pojo.PurchaseOrder;
import com.jk.pojo.ShoppingCart;
import com.jk.pojo.SupplierDrugs;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

public interface PurchaseServiceApi {

    @GetMapping("querySupplierDrugs")
    HashMap<String, Object> querySupplierDrugs(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows, SupplierDrugs supplierDrugs);

    @GetMapping("querySuppliers")
    List<SupplierDrugs> querySuppliers();

    @GetMapping("queryConsumption")
    List<ShoppingCart> queryConsumption();

    @GetMapping("queryShoppingCart")
    HashMap<String, Object> queryShoppingCart(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows, ShoppingCart shoppingCart);

    @GetMapping("queryPurchaseOrder")
    HashMap<String, Object> queryPurchaseOrder(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows, PurchaseOrder purchaseOrder);

    @GetMapping("queryToCart")
    SupplierDrugs queryToCart(@RequestParam("id") Integer id);

    @PostMapping("addToCart")
    void addToCart(@RequestBody ShoppingCart shoppingCart);

    @PostMapping("updateSupplierDrugs")
    void updateSupplierDrugs(@RequestParam("id") Integer id, @RequestParam("boxCount") Integer boxCount);

    @PostMapping("addPurchaseOrder")
    void addPurchaseOrder(@RequestBody PurchaseOrder purchaseOrder);

    @GetMapping("queryOrderManufacturer")
    List<PurchaseOrder> queryOrderManufacturer();

    @DeleteMapping("deleteOrder")
    void deleteOrder(@RequestParam("id") Integer id);

    @GetMapping("searchBig")
    List<Classification> searchBig();

    @GetMapping("searchSmall")
    List<Classification> searchSmall(@RequestParam("id") Integer id);

    @GetMapping("searchMinimum")
    List<Classification> searchMinimum(@RequestParam("id") Integer id);
}
