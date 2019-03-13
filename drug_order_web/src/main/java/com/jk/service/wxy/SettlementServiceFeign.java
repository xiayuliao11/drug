package com.jk.service.wxy;

import com.jk.service.wxy.SettlementService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("service-provider")
public interface SettlementServiceFeign extends SettlementService {
}
