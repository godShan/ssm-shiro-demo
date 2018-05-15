package com.wys.demo.controller;

import com.wys.demo.entity.Mock;
import com.wys.demo.mapper.MockMapper;
import com.wys.demo.service.IMockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @program: ssm-shiro-demo
 * @description: hello的controller
 * @author: godShan
 * @create: 2018-05-15 10:21
 **/
@Controller
public class HelloController {

    @Autowired
    private IMockService iMockService;

    @RequestMapping("/index")
    public String index(HttpServletRequest request) {
        List<Mock> mockList = iMockService.selectAll();
        request.setAttribute("mockList", mockList);
        return "/mock/mock";
    }

}
