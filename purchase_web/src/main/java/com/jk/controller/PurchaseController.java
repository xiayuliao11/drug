package com.jk.controller;

import com.jk.pojo.SupplierDrugs;
import com.jk.service.PurchaseServiceWeb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
//@RequestMapping("select")
public class PurchaseController {
    @Autowired
    private PurchaseServiceWeb purchaseServiceWeb;

    @RequestMapping("querySupplierDrugs")
    @ResponseBody
    public List<SupplierDrugs> querySupplierDrugs(SupplierDrugs supplierDrugs){
        return purchaseServiceWeb.querySupplierDrugs(supplierDrugs);
    }

}
