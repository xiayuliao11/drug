package com.jk.service.wxy;

import com.jk.mapper.wxy.SettlementMapper;
import com.jk.pojo.CardBean;
import com.jk.pojo.CountBean;
import com.jk.pojo.RecordBean;
import com.jk.pojo.SettlementBean;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;
@Service
public class SettlementServiceImpl implements SettlementMyService {
    @Autowired
    private SettlementMapper settlementMapper;

    @Override
    public List<SettlementBean> settlementList(SettlementBean settlementBean) {
        return  settlementMapper.settlementList(settlementBean);
    }

    @Override
    public int settlementPaymentList() {
        return settlementMapper.settlementPaymentList();
    }

    @Override
    public int settlementCashList() {
        return settlementMapper.settlementCashList();
    }



    @Override
    public void settlementById(@RequestParam("id") Integer id) {
        SettlementBean  checkInfo = settlementMapper.querySettlementInfoById(id);
        RecordBean recordBean =new RecordBean();
        recordBean.setRecordCommodity(checkInfo.getSettlementNumber());
        recordBean.setRecordAmount(checkInfo.getSettlementPayment());
        recordBean.setRecordStatus(checkInfo.getSettlementState());
        recordBean.setRecordTime(new Date());
        Date now = new Date();
        Date sub = DateUtils.addHours(now, 1);//给当前时间加一小时
        recordBean.setRecordSettling(sub);
        settlementMapper.saveSettlementHistory(recordBean);

        settlementMapper.settlementById(id);
    }

    @Override
    public List<RecordBean> querySettlementHistoryList() {
        return settlementMapper.querySettlementHistoryList();
    }

    @Override
    public int amountWithdrawn() {
        return settlementMapper.amountWithdrawn();
    }

    @Override
    public void saveBankCard(CardBean cardBean) {
            settlementMapper.saveBankCard(cardBean);
    }

    @Override
    public List<SettlementBean> setTest() {
        return settlementMapper.setTest();
    }

    @Override
    public List<CountBean> stat() {
        return settlementMapper.stat();
    }


}
