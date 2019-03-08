package com.jk.controller;

import com.jk.service.ManageService;
import com.jk.service.PortsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class PortController implements ManageService {
    @Autowired
    private PortsService portsService;


}
