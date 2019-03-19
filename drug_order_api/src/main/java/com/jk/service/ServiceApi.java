package com.jk.service;

import com.jk.pojo.*;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

public interface ServiceApi {

    @GetMapping("findStatus")
    List<SaleBean> findStatus(@RequestParam("saleStatus") Integer saleStatus);

    @PostMapping("updateStatus")
    void updateSend(@RequestParam("id") Integer id);

    @PostMapping("updateCancel")
    void updateCancel(@RequestParam("id") Integer id);

    @GetMapping("lookById")
    SaleBean lookById(@RequestParam("id") Integer id);

    @GetMapping("selectReturned")
    List<GoodsReturnedBean> selectReturned();

    @PostMapping("updateSure")
    void updateSure(@RequestParam("id") Integer id);

    @GetMapping("findMoney")
    List<GoodsReturnedBean> findMoney();

    @PostMapping("findSendgoods")
    List<SaleBean> findSendgoods(SaleBean bean);

    @PostMapping("findInvoice")
    List<InvoiceBean> findInvoice(InvoiceBean bean);

    @GetMapping("findStaff")
    List<StaffBean> findStaff(StaffBean bean);

    @PostMapping("start")
    void start(@RequestParam("id") Integer id);

    @PostMapping("shop")
    void shop(@RequestParam("id") Integer id);

    @DeleteMapping("delOne")
    void delOne(@RequestParam("id") Integer id);

    @PostMapping("saveStaff")
    void saveStaff(StaffBean bean);

    @GetMapping("id")
    StaffBean updateById(@RequestParam("id") Integer id);

    @GetMapping("findNotice")
    List<NoticeBean> findNotice();

    @PostMapping("up")
    void up(@RequestParam("id") Integer id);

    @PostMapping("down")
    void down(@RequestParam("id") Integer id);

    @DeleteMapping("delNotice")
    void delNotice(@RequestParam("id") Integer id);

    @PostMapping("addNotice")
    void saveNotice(NoticeBean bean);

    @GetMapping("returnById")
    GoodsReturnedBean returnById(@RequestParam("id") Integer id);

    @GetMapping("updateInvoice")
    void updateInvoice(@RequestParam("id") Integer id);

    @GetMapping("invoiceById")
    InvoiceBean invoiceById(@RequestParam("id") Integer id);

    @PostMapping("saveShop")
    void saveShop(ShopBean bean);

    @GetMapping("noticeById")
    NoticeBean noticeById(@RequestParam("id") Integer id);

    @PostMapping("findSupply")
    HashMap<String, Object> findSupply(@RequestParam("page") Integer page,@RequestParam("rows") Integer rows,SupplyBean bean);

    @GetMapping("selectTest")
    List<SupplyBean> selectTest();
}
