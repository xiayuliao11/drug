package com.jk.service;

import com.jk.mapper.PurchaseMapper;
import com.jk.pojo.PurchaseOrder;
import com.jk.pojo.ShoppingCart;
import com.jk.pojo.SupplierDrugs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class PurchaseServerServiceImpl implements PurchaseServerService{

    @Autowired
    private PurchaseMapper purchaseMapper;


    @Override
    public List<SupplierDrugs> querySuppliers() {
        return purchaseMapper.querySuppliers();
    }

    @Override
    public List<ShoppingCart> queryConsumption() {
        return purchaseMapper.queryConsumption();
    }

    @Override
    public List<PurchaseOrder> queryPurchaseOrder(PurchaseOrder purchaseOrder) {
        return purchaseMapper.queryPurchaseOrder(purchaseOrder);
    }

    @Override
    public SupplierDrugs queryToCart(Integer id) {
        return purchaseMapper.queryToCart(id);
    }

    @Override
    public void addToCart(ShoppingCart shoppingCart) {
        purchaseMapper.addToCart(shoppingCart);
    }

    @Override
    public void updateSupplierDrugs(Integer id, Integer boxCount) {
        purchaseMapper.updateSupplierDrugs(id,boxCount);
    }

    @Override
    public void addPurchaseOrder(PurchaseOrder purchaseOrder) {
        purchaseMapper.addPurchaseOrder(purchaseOrder);
    }

    @Override
    public HashMap<String, Object> querySupplierDrugs(Integer page, Integer rows, SupplierDrugs supplierDrugs) {
        HashMap<String, Object> map = new HashMap<>();
        int total = purchaseMapper.querySupplierDrugsCount(supplierDrugs); //总条数
        int start = (page-1)*rows;             //开始条数
        List<SupplierDrugs> list = purchaseMapper.querySupplierDrugsPage(start,rows,supplierDrugs);
        map.put("total", total);
        map.put("rows", list);
        return map;
    }

    @Override
    public HashMap<String, Object> queryShoppingCart(Integer page, Integer rows, ShoppingCart shoppingCart) {
        HashMap<String, Object> map = new HashMap<>();
        int total = purchaseMapper.queryShoppingCartCount(shoppingCart); //总条数
        int start = (page-1)*rows;             //开始条数
        List<SupplierDrugs> list = purchaseMapper.queryShoppingCartPage(start,rows,shoppingCart);
        map.put("total", total);
        map.put("rows", list);
        return map;
    }

    @Override
    public List<PurchaseOrder> queryOrderManufacturer() {
        return purchaseMapper.queryOrderManufacturer();
    }

    @Override
    public void deleteOrder(Integer id) {
        purchaseMapper.deleteOrder(id);
    }

}
