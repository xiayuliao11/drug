package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("service-order")
public interface PurchaseServiceWeb extends PurchaseServiceApi{

}
