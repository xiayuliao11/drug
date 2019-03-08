package com.jk.service.wxy;

import com.jk.pojo.SettlementBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("provider")
public interface SettlementService {

    @GetMapping("settlementList")
    List<SettlementBean> settlementList();

    @GetMapping("settlementPaymentList")
    int settlementPaymentList();

    @GetMapping("settlementCashList")
    int settlementCashList();
}
