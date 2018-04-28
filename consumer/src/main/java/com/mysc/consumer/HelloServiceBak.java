package com.mysc.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述
 *
 * @author tony
 * @version 1.0.0 createTime: 2018/4/23 9:57
 */
@FeignClient("hello-service")
public interface HelloServiceBak {
    @RequestMapping("/hello")
    String hello();
}
