package com.jk.controller;

import com.jk.mapper.PurchaseMapper;
import com.jk.pojo.SupplierDrugs;
import com.jk.service.PurchaseServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PurchaseControllerServer implements PurchaseServiceApi {
    @Autowired
    private PurchaseMapper purchaseMapper;

    @Override
    @RequestMapping("querySupplierDrugs")
    public List<SupplierDrugs> querySupplierDrugs(@RequestBody SupplierDrugs supplierDrugs) {
        return purchaseMapper.querySupplierDrugs(supplierDrugs);
    }
}
