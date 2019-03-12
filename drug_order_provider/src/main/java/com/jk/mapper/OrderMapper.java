package com.jk.mapper;

import com.jk.pojo.SaleBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {

    int findCount();

    List<SaleBean> findPage(@Param("start") int start,@Param("rows") Integer rows);


}
