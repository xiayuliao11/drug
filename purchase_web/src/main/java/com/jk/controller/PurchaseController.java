package com.jk.controller;

import com.jk.service.PurchaseServiceWeb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PurchaseController {
    @Autowired
    private PurchaseServiceWeb purchaseServiceWeb;

}
