package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("tree-server")
public interface TreeServiceDamo extends TreeService {
}
