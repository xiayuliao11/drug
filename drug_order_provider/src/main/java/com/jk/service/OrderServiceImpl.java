package com.jk.service;

import com.jk.mapper.OrderMapper;
import com.jk.pojo.*;
import com.netflix.discovery.converters.Auto;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

@Service
public class OrderServiceImpl  implements OrderService {

    @Autowired
    private OrderMapper OrderMapper;

    @Override
    public void updateSend(Integer id) {
        OrderMapper.updateSend(id);
    }

    @Override
    public void updateCancel(Integer id) {
        OrderMapper.updateCancel(id);
    }

    @Override
    public SaleBean lookById(Integer id) {
        return OrderMapper.lookById(id);
    }

    @Override
    public List<GoodsReturnedBean> selectReturned() {
        return OrderMapper.selectReturned();
    }

    @Override
    public void updateSure(@RequestParam("id") Integer id) {
        OrderMapper.updateSure(id);
    }

    @Override
    public List<GoodsReturnedBean> findMoney() {
        return OrderMapper.findMoney();
    }

    @Override
    public List<SaleBean> findSendgoods(SaleBean bean) {
        return OrderMapper.findSendgoods(bean);
    }

    @Override
    public List<InvoiceBean> findInvoice(InvoiceBean bean) {
        return OrderMapper.findInvoice(bean);
    }

    @Override
    public List<StaffBean> findStaff(StaffBean bean) {
        return OrderMapper.findStaff(bean);
    }

    @Override
    public void start(@RequestParam("id") Integer id) {
        OrderMapper.start(id);
    }

    @Override
    public void shop(@RequestParam("id") Integer id) {
        OrderMapper.shop(id);
    }

    @Override
    public void delOne(@RequestParam("id") Integer id) {
        OrderMapper.delOne(id);
    }

    @Override
    public void saveStaff(StaffBean bean) {
        OrderMapper.saveStaff(bean);
    }

    @Override
    public StaffBean updateById(@RequestParam("id") Integer id) {
        return OrderMapper.updateById(id);
    }

    @Override
    public List<NoticeBean> findNotice() {
        return OrderMapper.findNotice();
    }

    @Override
    public void up(@RequestParam("id") Integer id) {
        OrderMapper.up(id);
    }

    @Override
    public void down(@RequestParam("id")Integer id) {
        OrderMapper.down(id);
    }

    @Override
    public void delNotice(@RequestParam("id") Integer id) {
        OrderMapper.delNotice(id);
    }

    @Override
    public void saveNotice(NoticeBean bean) {
        OrderMapper.saveNotice(bean);
    }

    @Override
    public GoodsReturnedBean returnById(@RequestParam("id") Integer id) {
        return OrderMapper.returnById(id);
    }

    @Override
    public void updateInvoice(@RequestParam("id") Integer id) {
        OrderMapper.updateInvoice(id);
    }

    @Override
    public InvoiceBean invoiceById(@RequestParam("id") Integer id) {
        return OrderMapper.invoiceById(id);
    }

    @Override
    public void saveShop(ShopBean bean) {
        OrderMapper.saveShop(bean);
    }

    @Override
    public void updateStaff(StaffBean bean) {
        OrderMapper.updateStaff(bean);
    }

    @Override
    public NoticeBean noticeById(@RequestParam("id") Integer id) {
        return OrderMapper.noticeById(id);
    }

    @Override
    public void updateNotice(NoticeBean bean) {
        OrderMapper.updateNotice(bean);
    }

    @Override
    public List<SaleBean> findStatus(Integer saleStatus) {
        return OrderMapper.findStatus(saleStatus);
    }

    @Override
    public HashMap<String, Object> findSupply(Integer page,Integer rows,SupplyBean  bean) {
        HashMap<String, Object> hashMap = new HashMap<>();
        int total = OrderMapper.findOrderCount(bean);
        int start = (page-1)*rows;//开始条数
        List<SupplyBean> list = OrderMapper.list(start,rows,bean);
        hashMap.put("total", total);
        hashMap.put("rows", list);
        return hashMap;
    }

    @Override
    public List<SupplyBean> selectTest() {
        return OrderMapper.selectTest();
    }


}
