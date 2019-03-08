package com.jk.controller;

import com.jk.service.ManageService;
import com.jk.service.ManageServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import java.util.Map;

@Controller
public class ManageController {

    @Autowired
    private ManageServiceFeign manageServiceFeign;


}
