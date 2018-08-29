package com.nuanshui.frms.test.controller.example;

import com.nuanshui.frms.test.csservice.FrmsapiService;
import com.nuanshui.frms.test.entity.cs.Frmsapi;
import com.nuanshui.frms.test.utils.http.RequestUtil;
import groovy.util.logging.Slf4j;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@Controller
@RestController
@RequestMapping("/test")
@Slf4j
public class RunFrmsapiController{
    @Autowired
    private FrmsapiService frmsapiService;

//    private static final Logger log = LoggerFactory.getLogger(RunFrmsapiController.class);


    @RequestMapping(value = "/Runfrmsapi", method = RequestMethod.POST, produces = {
            "application/json; charset=utf-8" })
    @ResponseBody
    public boolean Runfrmsapi() throws Exception {
        try {
        List<Frmsapi> frmsapis= frmsapiService.queryfrmsapi();
            for (Frmsapi frs : frmsapis) {
                if (frs.getMethod() == "get") {
                    RequestUtil.sendgetWithHttp(frs.getUrl(), frs.getParam());
                }
                if (frs.getMethod() == "post") {
                    RequestUtil.sendpostWithHttp(frs.getUrl(), frs.getParam());
                } else {
                    return false;
                }
            }
        }catch (Exception e){
//            log.error("信用授权接口出错:【{}】", e);
            e.printStackTrace();
        }
        return true;

    }
}
