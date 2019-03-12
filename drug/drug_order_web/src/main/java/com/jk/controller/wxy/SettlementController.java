package com.jk.controller.wxy;

import com.jk.pojo.CardBean;
import com.jk.pojo.CountBean;
import com.jk.pojo.RecordBean;
import com.jk.pojo.SettlementBean;
import com.jk.service.wxy.SettlementServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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


    /*跳到 绑卡设置  的 HTML 页面 */
    @RequestMapping("toSettlementRecord")
    public  String toSettlementRecord(){
        return  "settlementRecord";
    }
    /*跳到结算记录里面*/
    @RequestMapping("toSettlementHistory")
    public  String toSettlementHistory(){

        return  "settlementHistory";
    }

    @RequestMapping("toStat")
    public  String toStat(){
        return  "statement";
    }

    /*结算申请的查询列表 */
    @PostMapping("settlementList")
    @ResponseBody
  /*  @RequestParam("name") String name*/
    public List<SettlementBean> settlementList( @RequestBody  SettlementBean settlementBean){
         return settlementServiceFeign.settlementList(settlementBean);
    }


    /*统计页面*/
    @GetMapping("stat")
    @ResponseBody
    public List<CountBean> stat(){
        return  settlementServiceFeign.stat();
    }


    /*________________________________________________________________________________________________________________*/
    @GetMapping("setTest")
    @ResponseBody
    public  List<SettlementBean> setTest(){
        return  settlementServiceFeign.setTest();
    }

    @GetMapping("querySettlementHistoryList")
    @ResponseBody
    public  List<RecordBean> querySettlementHistoryList(){

        return  settlementServiceFeign.querySettlementHistoryList();

    }


   /*待结算金额*/
    @GetMapping("settlementPaymentList")
    @ResponseBody
    public int settlementPaymentList(){
        return  settlementServiceFeign.settlementPaymentList();
    }
    /*结算记录: 累计提现总金额*/
    @GetMapping("amountWithdrawn")
    @ResponseBody
    public  int amountWithdrawn(){
        return  settlementServiceFeign.amountWithdrawn();
    }

    /*可提现金额*/
    @GetMapping("settlementCashList")
    @ResponseBody
    public  int settlementCashList(){
        return  settlementServiceFeign.settlementCashList();
    }

    /*申请结算按钮*/
    @PostMapping("settlementById")
    @ResponseBody
    public boolean settlementById(@RequestParam("id") Integer id){
        try{
            settlementServiceFeign.settlementById(id);
            return  true;
        }catch (Exception e){
            e.printStackTrace();
            return  false;
        }
    }

    /*绑卡设置*/
    @PostMapping("saveBankCard")
    @ResponseBody
    public  Boolean saveBankCard(@RequestBody CardBean cardBean){
        try {
            settlementServiceFeign.saveBankCard(cardBean);
            return  true;
        }catch (Exception e){
            e.printStackTrace();
            return  false;

        }
    }







}
