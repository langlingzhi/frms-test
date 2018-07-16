package com.nuanshui.frms.test.controller;

import com.nuanshui.frms.test.entity.Example;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 信息页面
 * Created by xingshi on 2017/09/27.
 */
@Controller
public class MainController {
    @Value("${spring.application.name}")
    private String projectName;

    @RequestMapping(path = "/info", method = RequestMethod.GET)
    @ResponseBody
    public String info() {
        return projectName;
    }

    public List<Example> findByName(@PathVariable("name") String name) {
        return null;
    }
}