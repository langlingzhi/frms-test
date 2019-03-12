package com.nuanshui.frms.test.controller.example;

import com.nuanshui.frms.test.csservice.FrmsapiService;
import com.nuanshui.frms.test.csservice.MessageListService;
import com.nuanshui.frms.test.entity.cs.Frmsapi;
import com.nuanshui.frms.test.entity.cs.MessageList;
import com.nuanshui.frms.test.utils.JacksonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Controller
@RestController
@RequestMapping("/test")
@Slf4j
public class MessageListController {

    @Autowired
    private MessageListService messageListService;

    @RequestMapping(value = "/saveMessageOrderInfo", method = RequestMethod.POST, produces = {
            "application/json; charset=utf-8"})
    @ResponseBody
    private String saveMessageOrderInfo(@RequestBody String json) throws IOException {
        MessageList messageList= JacksonUtils.parseJsonFromString(json,MessageList.class);
        Long res;
        String result;
        res=messageListService.addMessageList(messageList);
        if(res.equals(1)){
            return "{\"resultCode\":\"00\",\"resultMsg\":\"成功\"}";
        }else
        {
            return "{\"resultCode\":\"01\",\"resultMsg\":\"失败\"}";
        }


    }
    @RequestMapping(value = "/deleteMessageOrderInfo", method = RequestMethod.POST, produces = {
            "application/json; charset=utf-8"})
    @ResponseBody
    private String deleteMessageOrderInfo(@RequestBody String orderno) throws IOException {

        Long res;
        String result;
        res=messageListService.deleteMessageList(orderno);
        if(res.equals(1)){
            return "{\"resultCode\":\"00\",\"resultMsg\":\"成功\"}";
        }else
        {
            return "{\"resultCode\":\"01\",\"resultMsg\":\"失败\"}";
        }


    }
}
