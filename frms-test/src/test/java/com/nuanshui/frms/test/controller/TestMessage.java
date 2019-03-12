package com.nuanshui.frms.test.controller;

import com.nuanshui.frms.test.TestApplication;
import com.nuanshui.frms.test.csservice.MessageListService;
import com.nuanshui.frms.test.entity.Example;
import com.nuanshui.frms.test.entity.cs.MessageList;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Import(TestApplication.class)
public class TestMessage {
    @Autowired
    MessageListService messageListService;
    @Test
    public void addmessage(){
        MessageList messageList=new MessageList();
        messageList.setId((long) 1);
        messageList.setOrder_no("111255225");
        messageList.setMessage_order_no("44");
        messageList.setMessage_content("nishigeshagua");
        messageList.setDispatch_user("llz");
        messageList.setLoan_person("liyingying");
        messageList.setTelphone("18390906148");
        messageListService.addMessageList(messageList);
    }
    @Test
    public void deletemessage(){
        String oderno="111255225";
        messageListService.deleteMessageList(oderno);

    }
}
