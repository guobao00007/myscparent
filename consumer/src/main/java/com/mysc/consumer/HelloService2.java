package com.mysc.consumer;

import org.sc.HelloService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 描述
 *
 * @author tony
 * @version 1.0.0 createTime: 2018/4/23 10:38
 */
@FeignClient("hello-service")
public interface HelloService2 extends HelloService {

}
