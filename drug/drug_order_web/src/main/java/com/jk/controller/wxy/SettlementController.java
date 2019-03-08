package com.jk.controller.wxy;

import com.jk.pojo.SettlementBean;
import com.jk.service.wxy.SettlementServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping
public class SettlementController {

    @Autowired
    private SettlementServiceFeign settlementServiceFeign;


    /*跳到 结算申请  的 html 页面 */
    @RequestMapping("toSettlementShow")
    public  String toSettlementShow(){
     return  "settlementShow";
    }

    @RequestMapping("toSettlementRecord")
    public  String toSettlementRecord(){
        return  "settlementRecord";
    }



    /*结算申请的查询列表 */
    @GetMapping("settlementList")
    @ResponseBody
    public List<SettlementBean> settlementList(){
         return settlementServiceFeign.settlementList();
    }


    @GetMapping("settlementPaymentList")
    @ResponseBody
    public int settlementPaymentList(){
        return  settlementServiceFeign.settlementPaymentList();
    }

    @GetMapping("settlementCashList")
    @ResponseBody
    public  int settlementCashList(){
        return  settlementServiceFeign.settlementCashList();
    }

}
