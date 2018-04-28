package com.mysc.provider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述
 *
 * @author tony
 * @version 1.0.0 createTime: 2018/4/23 9:09
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        return "This is provider";
    }
}
