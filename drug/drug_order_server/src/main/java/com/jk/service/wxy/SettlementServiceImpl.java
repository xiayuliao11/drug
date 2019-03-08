package com.jk.service.wxy;

import com.jk.mapper.wxy.SettlementMapper;
import com.jk.pojo.SettlementBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SettlementServiceImpl implements SettlementMyService {
    @Autowired
    private SettlementMapper settlementMapper;

    @Override
    public List<SettlementBean> settlementList() {
        return  settlementMapper.settlementList();
    }

    @Override
    public int settlementPaymentList() {
        return settlementMapper.settlementPaymentList();
    }

    @Override
    public int settlementCashList() {
        return settlementMapper.settlementCashList();
    }


}
