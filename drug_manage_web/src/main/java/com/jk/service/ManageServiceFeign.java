package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("service-manage")
public interface ManageServiceFeign extends ManageService {
}
