package com.jk.service.wxy;

import com.jk.pojo.CardBean;
import com.jk.pojo.CountBean;
import com.jk.pojo.RecordBean;
import com.jk.pojo.SettlementBean;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface SettlementMyService {

    List<SettlementBean> settlementList( @RequestBody SettlementBean settlementBean);

    int settlementPaymentList();

    int settlementCashList();


    void settlementById(Integer id);


    List<RecordBean> querySettlementHistoryList();

    int amountWithdrawn();

    void saveBankCard(@RequestBody CardBean cardBean);

    List<SettlementBean> setTest();

    List<CountBean> stat();
}
