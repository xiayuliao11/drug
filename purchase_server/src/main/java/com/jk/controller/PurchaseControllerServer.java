package com.jk.controller;

import com.jk.mapper.PurchaseMapper;
import com.jk.service.PurchaseServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchaseControllerServer implements PurchaseServiceApi {
    @Autowired
    private PurchaseMapper purchaseMapper;

}
