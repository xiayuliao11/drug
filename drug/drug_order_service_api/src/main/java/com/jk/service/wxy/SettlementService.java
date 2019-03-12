package com.jk.service.wxy;

import com.jk.pojo.CardBean;
import com.jk.pojo.CountBean;
import com.jk.pojo.RecordBean;
import com.jk.pojo.SettlementBean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("provider")
public interface SettlementService {

    @PostMapping("settlementList")
    @ResponseBody
    List<SettlementBean> settlementList(@RequestBody  SettlementBean settlementBean);

    @GetMapping("querySettlementHistoryList")
    List<RecordBean> querySettlementHistoryList();


    @GetMapping("settlementPaymentList")
    int settlementPaymentList();

    @GetMapping("settlementCashList")
    int settlementCashList();


    @GetMapping("settlementById")
    void settlementById(@RequestParam("id") Integer id);


    @GetMapping("amountWithdrawn")
    int amountWithdrawn();

    @PostMapping("saveBankCard")
    @ResponseBody
    void saveBankCard(@RequestBody CardBean cardBean);

    @GetMapping("setTest")
    @ResponseBody
    List<SettlementBean> setTest();

    @GetMapping("stat")
    @ResponseBody
    List<CountBean> stat();
}
