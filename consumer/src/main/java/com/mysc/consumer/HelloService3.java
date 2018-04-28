package com.mysc.consumer;

import com.baofu.ps.service.facade.SmsFacade;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 描述
 *
 * @author tony
 * @version 1.0.0 createTime: 2018/4/26 15:02
 */
@FeignClient("sms-service")
public interface HelloService3 extends SmsFacade {

}
