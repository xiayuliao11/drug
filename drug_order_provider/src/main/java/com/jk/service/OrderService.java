package com.jk.service;

import com.jk.pojo.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

public interface OrderService {

    void updateSend(@RequestParam("id") Integer id);

    void updateCancel(@RequestParam("id") Integer id);

    SaleBean lookById(@RequestParam("id") Integer id);

    List<GoodsReturnedBean> selectReturned();

    void updateSure(@RequestParam("id") Integer id);

    List<GoodsReturnedBean> findMoney();

    List<SaleBean> findSendgoods(SaleBean  bean);

    List<InvoiceBean> findInvoice(InvoiceBean bean);

    List<StaffBean> findStaff();

    void start(@RequestParam("id") Integer id);

    void shop(@RequestParam("id") Integer id);

    void delOne(@RequestParam("id") Integer id);

    void saveStaff(StaffBean bean);

    StaffBean updateById(@RequestParam("id") Integer id);

    List<NoticeBean> findNotice();

    void up(@RequestParam("id") Integer id);

    void down(@RequestParam("id") Integer id);

    void delNotice(@RequestParam("id") Integer id);

    void saveNotice(NoticeBean bean);

    GoodsReturnedBean returnById(@RequestParam("id") Integer id);

    void updateInvoice(@RequestParam("id") Integer id);

    InvoiceBean invoiceById(@RequestParam("id") Integer id);

    void saveShop(ShopBean bean);

    void updateStaff(StaffBean bean);

    NoticeBean noticeById(@RequestParam("id") Integer id);

    void updateNotice(NoticeBean bean);

    List<SaleBean> findStatus(Integer saleStatus);
}
