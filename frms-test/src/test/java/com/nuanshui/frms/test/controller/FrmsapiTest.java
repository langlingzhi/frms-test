package com.nuanshui.frms.test.controller;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import com.nuanshui.frms.test.controller.example.ExampleController;
import com.nuanshui.frms.test.controller.example.FrmsapiController;
import com.nuanshui.frms.test.entity.Example;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class FrmsapiTest {
    @Autowired
    private FrmsapiController frmsapiController;

    @Test
    public void selectByPrimaryKeyTest(){
        Long id = 1L;
        Example example = new Example();
        example.setCode("name10");
        example.setName("name10");

    }
}
