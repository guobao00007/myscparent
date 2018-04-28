package com.mysc.consumer;

import com.baofu.ps.service.facade.model.SmsApiDTO;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述
 *
 * @author tony
 * @version 1.0.0 createTime: 2018/4/23 9:58
 */
@RestController
public class FeignConsumerController {
    @Autowired
    HelloService2 helloService2;

    @Autowired
    HelloService3 helloService3;

    @RequestMapping("/hello1")
    @HystrixCommand(fallbackMethod="myfallback")
    public String hello1() {
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return helloService2.hello("张三");
    }

    @RequestMapping("/hello3")
    public String hello3() {
        SmsApiDTO apiDTO=new SmsApiDTO();
        apiDTO.setChannel("DH");
        //apiDTO.setContent("12345");
        apiDTO.setTemplateId("balance");
        apiDTO.setParameters("$[merchantName]-拍多贷&$[alarmBal]-121212");
        apiDTO.setMd5sign("aaa");
        apiDTO.setMobile("18616093460");
        apiDTO.setSign("123");
        apiDTO.setUsername("xinyan");
        return helloService3.sms(apiDTO).getMsg();
    }

    public String myfallback() {
        return "consumerfallback";
    }

}
