package com.jk.service;

import com.jk.pojo.TreeBean;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

@FeignClient("service-manage")
public interface InformationServiceWeb extends InformationServiceApi{



}
