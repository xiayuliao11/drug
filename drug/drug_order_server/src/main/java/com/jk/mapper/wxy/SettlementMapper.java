package com.jk.mapper.wxy;

import com.jk.pojo.CardBean;
import com.jk.pojo.CountBean;
import com.jk.pojo.RecordBean;
import com.jk.pojo.SettlementBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface SettlementMapper {

    List<SettlementBean> settlementList(@Param("settlementBean")SettlementBean settlementBean);

    @Select("select SUM(settlementPayment) from drug_settlement t where t.settlementState = 1 ")
    int settlementPaymentList();

    @Select("select SUM(settlementPayment) from drug_settlement t where t.settlementState = 3 ")
    int settlementCashList();


    @Select("UPDATE  drug_settlement t set  t.settlementPayment =0,t.settlementState =2  WHERE t.settlementId  = #{id}")
    void settlementById(@Param("id") Integer id);



    @Select("select * from  drug_settlement where settlementId = #{id} ")
    SettlementBean querySettlementInfoById(@Param("id")Integer id);

    @Insert("insert into drug_record(recordCommodity,recordTime,recordAmount,recordSettling,recordStatus) " +
            "value (#{recordCommodity},#{recordTime},#{recordAmount},#{recordSettling},#{recordStatus} )")
    void saveSettlementHistory(RecordBean recordBean);

    @Select("select * from drug_record")
    List<RecordBean> querySettlementHistoryList();

    @Select("select SUM(recordAmount) from drug_record t ")
    int amountWithdrawn();

    @Insert("insert into drug_card  (bindingBank,bindingNumber,bindingPassword,bindingPeople,bindingPhone)" +
            " value (#{bindingBank},#{bindingNumber},#{bindingPassword},#{bindingPeople},#{bindingPhone} )")
      void saveBankCard( CardBean cardBean);

    List<SettlementBean> setTest();

    @Select("select * from drug_count")
    List<CountBean> stat();
}
