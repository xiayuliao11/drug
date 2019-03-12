package com.jk.mapper;

import com.jk.pojo.PurchaseOrder;
import com.jk.pojo.ShoppingCart;
import com.jk.pojo.SupplierDrugs;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PurchaseMapper {

    int querySupplierDrugsCount(@Param("supplierDrugs")SupplierDrugs supplierDrugs);

    List<SupplierDrugs> querySupplierDrugsPage(@Param("start")int start,@Param("rows")Integer rows,@Param("supplierDrugs")SupplierDrugs supplierDrugs);

    @Select("select id,manufacturer from t_supplier_grugs")
    List<SupplierDrugs> querySuppliers();

    int queryShoppingCartCount(@Param("shoppingCart")ShoppingCart shoppingCart);

    List<SupplierDrugs> queryShoppingCartPage(@Param("start")int start,@Param("rows")Integer rows,@Param("shoppingCart")ShoppingCart shoppingCart);

    List<PurchaseOrder> queryPurchaseOrder(@Param("purchaseOrder")PurchaseOrder purchaseOrder);

    SupplierDrugs queryToCart(@Param("id")Integer id);

    void addToCart(ShoppingCart shoppingCart);
}
