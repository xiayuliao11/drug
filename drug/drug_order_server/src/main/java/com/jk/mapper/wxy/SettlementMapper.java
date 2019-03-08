package com.jk.mapper.wxy;

import com.jk.pojo.SettlementBean;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SettlementMapper {
    @Select("select * from drug_settlement")
    List<SettlementBean> settlementList();

    @Select("select SUM(settlementPayment) from drug_settlement t where t.settlementState = 1 ")
    int settlementPaymentList();

    @Select("select SUM(settlementPayment) from drug_settlement t where t.settlementState = 0")
    int settlementCashList();
}
