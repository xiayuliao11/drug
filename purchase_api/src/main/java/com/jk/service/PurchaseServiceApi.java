package com.jk.service;

import com.jk.pojo.SupplierDrugs;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface PurchaseServiceApi {

    @GetMapping("querySupplierDrugs")
    List<SupplierDrugs> querySupplierDrugs(SupplierDrugs supplierDrugs);
}
