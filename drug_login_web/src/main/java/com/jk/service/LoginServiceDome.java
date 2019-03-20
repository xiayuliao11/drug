package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("login-server")
public interface LoginServiceDome extends LoginServiceApi {
}
