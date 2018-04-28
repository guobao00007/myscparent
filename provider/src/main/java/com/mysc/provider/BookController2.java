package com.mysc.provider;

import org.sc.HelloService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述
 *
 * @author tony
 * @version 1.0.0 createTime: 2018/4/23 10:36
 */
@RestController
public class BookController2 implements HelloService {
    @Override
    public String hello(@RequestParam("name") String name) {
        System.out.println("calling me");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "this is for1122 " + name + "!";

    }

}
