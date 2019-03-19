package com.jk.mapper;

import com.jk.pojo.Classification;
import com.jk.pojo.PurchaseOrder;
import com.jk.pojo.ShoppingCart;
import com.jk.pojo.SupplierDrugs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface PurchaseMapper {

    int querySupplierDrugsCount(@Param("supplierDrugs") SupplierDrugs supplierDrugs);

    List<SupplierDrugs> querySupplierDrugsPage(@Param("start") int start, @Param("rows") Integer rows, @Param("supplierDrugs") SupplierDrugs supplierDrugs);

    @Select("select id,manufacturer from t_supplier_grugs group by manufacturer")
    List<SupplierDrugs> querySuppliers();

    @Select("select id,subtotal from shopping_cart")
    List<ShoppingCart> queryConsumption();

    int queryShoppingCartCount(ShoppingCart shoppingCart);

    List<SupplierDrugs> queryShoppingCartPage(@Param("start") int start, @Param("rows") Integer rows, @Param("shoppingCart") ShoppingCart shoppingCart);


    SupplierDrugs queryToCart(@Param("id") Integer id);

    void addToCart(ShoppingCart shoppingCart);

    @Update("update t_supplier_grugs set stock=stock-#{boxCount} where id=#{id}")
    void updateSupplierDrugs(@Param("id") Integer id, @Param("boxCount") Integer boxCount);

    void addPurchaseOrder(PurchaseOrder purchaseOrder);

    @Select("select id,manufacturer from purchase_order group by manufacturer")
    List<PurchaseOrder> queryOrderManufacturer();

    @Delete("delete from shopping_cart where id=#{id}")
    void deleteOrder(@Param("id") Integer id);

    int queryPurchaseOrderCount(PurchaseOrder purchaseOrder);

    List<SupplierDrugs> queryPurchaseOrderPage(@Param("start") int start, @Param("rows") Integer rows, @Param("purchaseOrder") PurchaseOrder purchaseOrder);

    @Select("select * from t_classification where pid = 0")
    List<Classification> searchBig();

    @Select("select * from t_classification where pid = #{id}")
    List<Classification> searchSmall(Integer id);

    @Select("select * from t_classification where pid = #{id}")
    List<Classification> searchMinimum(Integer id);
}
