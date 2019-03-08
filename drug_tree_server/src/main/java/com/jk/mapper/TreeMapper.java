package com.jk.mapper;

import com.jk.pojo.TreeBean;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TreeMapper {
    @Select("select * from t_tree where pid=#{id}")
    List<TreeBean> getTree(Integer id);
}
