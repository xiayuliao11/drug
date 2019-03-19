package com.jk.mapper;

import com.jk.pojo.*;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface OrderMapper {

    @Update("update t_sale set sale_status=2 where id=#{id};")
    void updateSend(@Param("id") Integer id);

    @Update("update t_sale set sale_status=5 where id=#{id};")
    void updateCancel(@Param("id") Integer id);

    SaleBean lookById(@Param("id") Integer id);

    List<GoodsReturnedBean> selectReturned();

    @Update("update goods_returned_note set sales_return_state=1 where id=#{id} ")
    void updateSure(@Param("id") Integer id);

    List<GoodsReturnedBean> findMoney();

    List<SaleBean> findSendgoods(SaleBean bean);

    List<InvoiceBean> findInvoice(InvoiceBean bean);

    @Select("select * from t_staff")
    List<StaffBean> findStaff(StaffBean bean);

    @Update("update t_staff set status=1 where id=#{id}")
    void start(Integer id);

    @Update("update t_staff set status=0 where id=#{id}")
    void shop(Integer id);

    @Delete("delete from t_staff where id=#{id}")
    void delOne(Integer id);

    @Insert("insert into t_staff(name,qq,status,time) values(#{name},#{qq},#{status},'2019-3-14')")
    void saveStaff(StaffBean bean);

    @Select("select * from t_staff where id=#{id}")
    StaffBean updateById(Integer id);

    @Select("select * from t_notice")
    List<NoticeBean> findNotice();

    @Update("update t_notice set status=1 where id=#{id}")
    void up(Integer id);

    @Update("update t_notice set status=0  where id=#{id}")
    void down(Integer id);

    @Delete("delete from t_notice where id=#{id}")
    void delNotice(Integer id);

    @Insert("insert into t_notice(headline,status,content,time) values(#{headline},#{status},#{content},'2019-9-21')")
    void saveNotice(NoticeBean bean);

    GoodsReturnedBean returnById(Integer id);

    @Update("update t_invoice set status=1 where id=#{id}")
    void updateInvoice(Integer id);

    @Select("select * from t_invoice where id=#{id}")
    InvoiceBean invoiceById(Integer id);

    @Insert("insert into t_shop(name,phone,img) values(#{name},#{phone},#{img})")
    void saveShop(ShopBean bean);

    @Update("update t_staff  set name=#{name},qq=#{qq},status=#{status} where id=#{id}")
    void updateStaff(StaffBean bean);

    @Select("select * from  t_notice where id=#{id} ")
    NoticeBean noticeById(Integer id);

    @Update("update t_notice set headline=#{headline},content=#{content},status=#{status}  where id=#{id} ")
    void updateNotice(NoticeBean bean);

    List<SaleBean> findStatus(@Param("saleStatus") Integer saleStatus);

    List<SupplyBean> list(@Param("start") int start, @Param("rows") Integer rows,@Param("bean") SupplyBean bean);

    int findOrderCount(@Param("bean") SupplyBean bean);

    @Select("select * from t_supply")
    List<SupplyBean> selectTest();
}
