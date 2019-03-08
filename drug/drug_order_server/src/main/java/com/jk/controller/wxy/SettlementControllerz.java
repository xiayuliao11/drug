package com.jk.controller.wxy;

import com.jk.pojo.SettlementBean;
import com.jk.service.wxy.SettlementMyService;
import com.jk.service.wxy.SettlementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SettlementControllerz implements SettlementService {
    @Autowired
    private SettlementMyService settlementMyService;


    @Override
    @ResponseBody
    /*查询列表 方法()*/
    public List<SettlementBean> settlementList() {
        return settlementMyService.settlementList();
    }

    @Override
    @ResponseBody
    public int settlementPaymentList() {
        return settlementMyService.settlementPaymentList();
    }

    @Override
    @ResponseBody
    public int settlementCashList() {
        return settlementMyService.settlementCashList();
    }


}
