package com.jk.service;

import com.jk.pojo.PurchaseOrder;
import com.jk.pojo.ShoppingCart;
import com.jk.pojo.SupplierDrugs;

import java.util.HashMap;
import java.util.List;

public interface PurchaseServerService {

    List<SupplierDrugs> querySuppliers();

    List<ShoppingCart> queryConsumption();

    List<PurchaseOrder> queryPurchaseOrder(PurchaseOrder purchaseOrder);

    SupplierDrugs queryToCart(Integer id);

    void addToCart(ShoppingCart shoppingCart);

    void updateSupplierDrugs(Integer id, Integer boxCount);

    void addPurchaseOrder(PurchaseOrder purchaseOrder);

    HashMap<String, Object> querySupplierDrugs(Integer page, Integer rows, SupplierDrugs supplierDrugs);

    HashMap<String, Object> queryShoppingCart(Integer page, Integer rows, ShoppingCart shoppingCart);

    List<PurchaseOrder> queryOrderManufacturer();

    void deleteOrder(Integer id);
}
