package com.jk.controller.wxy;


import com.jk.pojo.CardBean;
import com.jk.pojo.CountBean;
import com.jk.pojo.RecordBean;
import com.jk.pojo.SettlementBean;
import com.jk.service.wxy.SettlementMyService;
import com.jk.service.wxy.SettlementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
public class SettlementControllerz implements SettlementService {
    @Autowired
    private SettlementMyService settlementMyService;


    @Override
    @ResponseBody
    /*查询结算列表 方法()  */
    public List<SettlementBean> settlementList(@RequestBody SettlementBean settlementBean) {
        List<SettlementBean> list  =  settlementMyService.settlementList(settlementBean);
        return list;
    }

    @Override
    @ResponseBody
        public List<RecordBean> querySettlementHistoryList() {
        return settlementMyService.querySettlementHistoryList();
    }


    @Override
    @ResponseBody
    /* 待结算金额 */
    public int settlementPaymentList() {
        return settlementMyService.settlementPaymentList();
    }

    @Override
    @ResponseBody
    /* 可提现金额 */
    public int settlementCashList() {
        return settlementMyService.settlementCashList();
    }



    @Override
    @ResponseBody
    /*申请结算*/
    public void settlementById(@RequestParam("id") Integer id) {
        settlementMyService.settlementById(id);
    }

    @Override
    @ResponseBody
    public int amountWithdrawn() {
        return settlementMyService.amountWithdrawn();
    }

    @Override
    @ResponseBody
    public void saveBankCard(@RequestBody CardBean cardBean) {
        settlementMyService.saveBankCard(cardBean);
    }

    @Override
    @ResponseBody
    public List<SettlementBean> setTest() {
        return settlementMyService.setTest();
    }

    @Override
    public List<CountBean> stat() {
        return settlementMyService.stat();
    }


}
