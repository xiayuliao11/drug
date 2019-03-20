package com.jk.controller;


import com.jk.pojo.*;
import com.jk.service.OrderServiceFeign;
import com.jk.utils.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@Controller
public class OrderController {

    @Autowired
    private OrderServiceFeign orderServiceFeign;

    /**
     * 订单页面
     * @return
     */
    @RequestMapping("selectSale")
    public String selectSale(){
        return "show";
    }
    /**
     * 店铺查询
     * @return
     */
    @RequestMapping("selectShop")
    public  String  selectShop(){
        return "shop";
    }
    /**
     * 详情页面
     * @return
     */
    @RequestMapping("toLook")
    public  String  selectLook(){
        return "look";
    }
    /**
     * 退货页面
     * @return
     */
    @RequestMapping("selectReturned")
    public String  selectReturned(){
        return "returned";
    }

    /**
     * 退款页面
     * @return
     */
    @RequestMapping("selectMoney")
    public String selectMoney(){
        return "money";
    }

    /**
     * 发货页面
     * @return
     */
    @RequestMapping("selectSendgoods")
    public String selectSendgoods(){
        return "sendgoods";
    }

    /**
     * 查询发票
     * @return
     */
    @RequestMapping("selectInvoice")
    public String selectInvoice(){
        return "invoice";
    }

    /**
     *查询客服
     * @return
     */
    @RequestMapping("selectStaff")
    public String selectStaff(){
        return "staff";
    }

    /**
     * 新增客服
     * @return
     */
    @RequestMapping("toAdd")
    public String toAdd(){
        return "add";
    }

    /**
     * 修改页面
     * @return
     */
    @RequestMapping("toUpdate")
    public String toUpdate(){
        return "add";
    }

    /**
     * 公告页面
     * @return
     */
    @RequestMapping("selectNotice")
    public  String selectNotice(){
        return "notice";
    }
    /**
     *新增公告页面
     * @return
     */
    @RequestMapping("toAddNotice")
    public String  toAddNotice(){
       return "addNotice";
    }

    /**
     * 退款回显页面
     * @return
     */
    @RequestMapping("toReturned")
    public  String toReturned(){
        return "hxReturn";
    }

    /**
     * 发票回显页面
     * @return
     */
    @RequestMapping("toInvoice")
    public String  toInvoice(){
        return "hxInvoice";
    }
    /**
     * 导航 退货管理
     * @return
     */
    @RequestMapping("selectdhReturned")
    public String  selectdhReturned(){
        return  "dhReturned";
    }

    /**
     * 供应信息
     * @return
     */
    @RequestMapping("selectSupply")
    public String selectSupply(){
        return "supply";
    }
///////////////////////////////////////////////////////////////////////////////////
    /**
     * 回显详情
     * @param id
     * @return
     */
    @GetMapping("lookById")
    @ResponseBody
    public SaleBean lookById(@RequestParam("id") Integer id){
        return orderServiceFeign.lookById(id);
    }
    /**
     * 回显退款
     * @param id
     * @return
     */
    @GetMapping("returnById")
    @ResponseBody
    public GoodsReturnedBean returnById(@RequestParam("id") Integer id){
        return orderServiceFeign.returnById(id);
    }
    /**
     * 回显发票
     * @param id
     * @return
     */
    @GetMapping("invoiceById")
    @ResponseBody
    public InvoiceBean invoiceById(@RequestParam("id") Integer id){
        return orderServiceFeign.invoiceById(id);
    }
    /**
     * 回显公告
     * @param id
     * @return
     */
    @GetMapping("noticeById")
    @ResponseBody
    public NoticeBean noticeById(@RequestParam("id") Integer id){
        return orderServiceFeign.noticeById(id);
    }

    /**
     * 查询状态
     * @param page
     * @param rows
     * @param status
     * @return
     */
    @GetMapping("findStatus")
    @ResponseBody
    public List<SaleBean>  findStatus(@RequestParam("saleStatus")Integer saleStatus){
        return orderServiceFeign.findStatus(saleStatus);
    }
    /**
     * 退货查询
     * @return
     */
    @GetMapping("findReturned")
    @ResponseBody
    public List<GoodsReturnedBean> findReturned(){
        return  orderServiceFeign.selectReturned();
    }
    /**
     * 退钱查询
     * @return
     */
    @GetMapping("findMoney")
    @ResponseBody
    public List<GoodsReturnedBean> findMoney(){
        return  orderServiceFeign.findMoney();
    }
    /**
     * 发票查询
     * @return
     */
    @GetMapping("findInvoice")
    @ResponseBody
    public  List<InvoiceBean>findInvoice(InvoiceBean bean){
        return   orderServiceFeign.findInvoice(bean);
    }

    /**
     * 发货
     * @param id
     * @return
     */
    @PostMapping("updateSend")
    @ResponseBody
    public void updateSend(@RequestParam("id") Integer id){
            orderServiceFeign.updateSend(id);
    }
    /**
     * 开票
     * @param id
     * @return
     */
    @PostMapping("updateInvoice")
    @ResponseBody
    public void updateInvoice(@RequestParam("id") Integer id){
        orderServiceFeign.updateInvoice(id);
    }
    /**
     * 取消订单
     * @param id
     * @return
     */
    @PostMapping("updateCancel")
    @ResponseBody
    public void updateCancel(@RequestParam("id") Integer id){
        orderServiceFeign.updateCancel(id);
    }
    /**
     * 确定
     * @param id
     * @return
     */
    @PostMapping("updateSure")
    @ResponseBody
    public void updateSure(@RequestParam("id") Integer id){
        orderServiceFeign.updateSure(id);
    }
    /**
     * 查询收货
     * @return
     */
    @GetMapping("findSendgoods")
    @ResponseBody
    private List<SaleBean>findSendgoods(SaleBean bean){
      return orderServiceFeign.findSendgoods(bean);
    }
    /**
     * 查询客服
     * @return
     */
    @GetMapping("findStaff")
    @ResponseBody
    public List<StaffBean> findStaff(StaffBean bean){
      return orderServiceFeign.findStaff(bean);
    }
    /**
     * 启用
     * @param id
     */
    @PostMapping("start")
    @ResponseBody
    public void  start(@RequestParam("id") Integer id){
        orderServiceFeign.start(id);
    }
    /**
     * 停用
     * @param id
     */
    @PostMapping("shop")
    @ResponseBody
    public void shop(@RequestParam("id")Integer id){
        orderServiceFeign.shop(id);
    }
    /**
     * 上线
     * @param id
     */
    @PostMapping("up")
    @ResponseBody
    public void  up(@RequestParam("id") Integer id){
        orderServiceFeign.up(id);
    }
    /**
     * 下线
     * @param id
     */
    @PostMapping("down")
    @ResponseBody
    public void down(@RequestParam("id")Integer id){
        orderServiceFeign.down(id);
    }
    /**
     * 新增客服
     * @param bean
     */
    @PostMapping("saveStaff")
    @ResponseBody
    public void saveStaff(StaffBean bean){
        orderServiceFeign.saveStaff(bean);
    }
    /**
     * 新增公告
     * @param bean
     */
    @PostMapping("saveNotice")
    @ResponseBody
    public void saveNotice(NoticeBean bean){
        orderServiceFeign.saveNotice(bean);
    }
    /**
     * 删除客服
     * @param id
     */
    @DeleteMapping("delOne")
    @ResponseBody
    public  void delOne(@RequestParam("id")Integer id){
        orderServiceFeign.delOne(id);
    }
    /**
     * 删除公告
     * @param id
     */
    @DeleteMapping("delNotice")
    @ResponseBody
    public  void delNotice(@RequestParam("id")Integer id){
        orderServiceFeign.delNotice(id);
    }
    /**
     * 回显
     * @param id
     * @return
     */
    @GetMapping("updateById")
    @ResponseBody
    public StaffBean updateById(@RequestParam("id") Integer id){
        return orderServiceFeign.updateById(id);
    }
    /**
     *公告查询
     * @return
     */
    @GetMapping("findNotice")
    @ResponseBody
    public  List<NoticeBean>findNotice(){
       return  orderServiceFeign.findNotice();
    }

    /**
     * 图片上传
     * @param img
     * @param request
     * @return
     */
    @RequestMapping("shopImg")
    @ResponseBody
    public HashMap<String, String> uploadUserImg(MultipartFile img, HttpServletRequest request) {
        HashMap<String, String> result = new HashMap<>();
        String fileUpload = FileUtil.fileUploadBootStrap(img, request);
        result.put("img", fileUpload);
        return result;
    }

    /**
     * 添加店铺
     * @param bean
     */
    @PostMapping("saveShop")
    @ResponseBody
    public void  saveShop(ShopBean bean){
        orderServiceFeign.saveShop(bean);
    }

    /**
     * 查询供应
     * @param page
     * @param rows
     * @return
     */
    @GetMapping("findSupply")
    @ResponseBody
    public HashMap<String,Object> findSupply(@RequestParam("page") Integer page,@RequestParam("rows") Integer rows,SupplyBean bean){
        return   orderServiceFeign.findSupply(page,rows,bean);
    }

    @GetMapping("selectTest")
    @ResponseBody
    public List<SupplyBean>selectTest(){
        return orderServiceFeign.selectTest();
    }

}
