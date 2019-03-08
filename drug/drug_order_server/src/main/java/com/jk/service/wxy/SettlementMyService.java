package com.jk.service.wxy;

import com.jk.pojo.SettlementBean;

import java.util.List;

public interface SettlementMyService {

    List<SettlementBean> settlementList();

    int settlementPaymentList();

    int settlementCashList();
}
