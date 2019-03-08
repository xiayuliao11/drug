package com.jk.service;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("order-service")//声明为feig客户端 指明要调用的服务
public interface OrderServiceFeign extends OrderService {
}
