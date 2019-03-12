package com.jk.service;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("provider")
public interface OrderServiceFeign extends  ServiceApi{


}
