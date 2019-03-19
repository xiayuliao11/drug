package com.jk.controller;

import com.jk.pojo.*;
import com.jk.service.OrderService;
import com.jk.service.ServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
public class OrderController implements ServiceApi {

    @Autowired
    private OrderService OrderService;

    @Override
    @ResponseBody
    public List<SaleBean> findStatus(@RequestParam("saleStatus") Integer saleStatus) {
        return OrderService.findStatus(saleStatus);
    }

    @Override
    @ResponseBody
    public void updateSend(@RequestParam("id") Integer id) {
        OrderService.updateSend(id);
    }

    @Override
    @ResponseBody
    public void updateCancel(@RequestParam("id")Integer id) {
        OrderService.updateCancel(id);
    }

    @Override
    @ResponseBody
    public SaleBean lookById(@RequestParam("id") Integer id) {
        return OrderService.lookById(id);
    }

    @Override
    @ResponseBody
    public List<GoodsReturnedBean> selectReturned() {
        return OrderService.selectReturned();
    }

    @Override
    @ResponseBody
    public void updateSure(@RequestParam("id") Integer id) {
        OrderService.updateSure(id);
    }

    @Override
    @ResponseBody
    public List<GoodsReturnedBean> findMoney() {
        return OrderService.findMoney();
    }

    @Override
    @ResponseBody
    public List<SaleBean> findSendgoods(@RequestBody SaleBean bean) {
        return OrderService.findSendgoods(bean);
    }

    @Override
    @ResponseBody
    public List<InvoiceBean> findInvoice(@RequestBody InvoiceBean bean) {
        return OrderService.findInvoice(bean);
    }

    @Override
    @ResponseBody
    public List<StaffBean> findStaff(@RequestBody StaffBean bean) {
        return OrderService.findStaff(bean);
    }

    @Override
    @ResponseBody
    public void start(@RequestParam("id") Integer id) {
        OrderService.start(id);
    }

    @Override
    @ResponseBody
    public void shop(@RequestParam("id") Integer id) {
        OrderService.shop(id);
    }

    @Override
    @ResponseBody
    public void delOne(@RequestParam("id")Integer id) {
        OrderService.delOne(id);
    }

    @Override
    @ResponseBody
    public void saveStaff(@RequestBody StaffBean bean) {
        Integer id = bean.getId();
        if(id!=null){
            OrderService.updateStaff(bean);
        }else{
            //新增
            OrderService.saveStaff(bean);
        }
    }

    @Override
    @ResponseBody
    public StaffBean updateById(@RequestParam("id") Integer id) {
        return OrderService.updateById(id);
    }

    @Override
    @ResponseBody
    public List<NoticeBean> findNotice() {
        return OrderService.findNotice();
    }

    @Override
    @ResponseBody
    public void up(@RequestParam("id") Integer id) {
        OrderService.up(id);
    }

    @Override
    @ResponseBody
    public void down(@RequestParam("id") Integer id) {
        OrderService.down(id);
    }

    @Override
    @ResponseBody
    public void delNotice(@RequestParam("id") Integer id) {
        OrderService.delNotice(id);
    }

    @Override
    @ResponseBody
    public void saveNotice(@RequestBody NoticeBean bean) {
        Integer id = bean.getId();
        if(id!=null){
            OrderService.updateNotice(bean);
        }else{
            //新增
            OrderService.saveNotice(bean);
        }
    }

    @Override
    @ResponseBody
    public GoodsReturnedBean returnById(@RequestParam("id") Integer id) {
        return OrderService.returnById(id);
    }

    @Override
    @ResponseBody
    public void updateInvoice(@RequestParam("id") Integer id) {
        OrderService.updateInvoice(id);
    }

    @Override
    @ResponseBody
    public InvoiceBean invoiceById(@RequestParam("id")Integer id) {
        return OrderService.invoiceById(id);
    }

    @Override
    @ResponseBody
    public void saveShop(@RequestBody ShopBean bean) {
        OrderService.saveShop(bean);
    }

    @Override
    @ResponseBody
    public NoticeBean noticeById(@RequestParam("id") Integer id) {
        return OrderService.noticeById(id);
    }

    @Override
    @ResponseBody
    public HashMap<String, Object> findSupply(@RequestParam("page") Integer page,@RequestParam("rows") Integer rows,@RequestBody SupplyBean bean) {
        return OrderService.findSupply(page,rows,bean);
    }

    @Override
    @ResponseBody
    public List<SupplyBean> selectTest() {
        return OrderService.selectTest();
    }


}
