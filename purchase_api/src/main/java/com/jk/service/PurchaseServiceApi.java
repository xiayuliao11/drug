package com.jk.service;

import com.jk.pojo.PurchaseOrder;
import com.jk.pojo.ShoppingCart;
import com.jk.pojo.SupplierDrugs;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

public interface PurchaseServiceApi {

    @GetMapping("querySupplierDrugs")
    HashMap<String, Object> querySupplierDrugs(@RequestParam("page") Integer page,@RequestParam("rows") Integer rows,@RequestBody SupplierDrugs supplierDrugs);

    @GetMapping("querySuppliers")
    List<SupplierDrugs> querySuppliers();

    @GetMapping("queryShoppingCart")
    HashMap<String, Object> queryShoppingCart(@RequestParam("page") Integer page,@RequestParam("rows") Integer rows,@RequestBody ShoppingCart shoppingCart);

    @GetMapping("queryPurchaseOrder")
    List<PurchaseOrder> queryPurchaseOrder(@RequestBody PurchaseOrder purchaseOrder);

    @GetMapping("queryToCart")
    SupplierDrugs queryToCart(@RequestParam("id")Integer id);

    @PostMapping("addToCart")
    void addToCart(@RequestBody ShoppingCart shoppingCart);
}
