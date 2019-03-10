package com.jk.treeservice;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("tree-server")
public interface TreeServiceDamo extends TreeService {
}
