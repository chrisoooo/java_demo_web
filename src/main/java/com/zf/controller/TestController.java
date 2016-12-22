package com.zf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by chris on 2016/12/21.
 */

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public Object queryCacheStrategy(HttpServletRequest request,
                                         @ModelAttribute Object m) {

        System.out.println("test");

        return "test";
    }


}
