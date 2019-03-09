package com.jk.mapper;

import com.jk.pojo.SupplierDrugs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PurchaseMapper {

    List<SupplierDrugs> querySupplierDrugs(@Param("supplierDrugs") SupplierDrugs supplierDrugs);
}
