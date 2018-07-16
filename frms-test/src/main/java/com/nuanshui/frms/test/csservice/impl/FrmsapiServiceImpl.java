package com.nuanshui.frms.test.csservice.impl;

import com.nuanshui.frms.test.csmapper.FrmsapiMapper;
import com.nuanshui.frms.test.csmapper.MessageListMapper;
import com.nuanshui.frms.test.csservice.FrmsapiService;
import com.nuanshui.frms.test.entity.cs.Frmsapi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class FrmsapiServiceImpl implements FrmsapiService {
    @Autowired
    private FrmsapiMapper frmsapiMapper;

    @Override
    public Long getfrmsapi(Frmsapi frmsapi) {

        return frmsapiMapper.getfrmsapi(frmsapi);
    }

    @Override
    public List<Frmsapi> queryfrmsapi( ) {
        return frmsapiMapper.queryfrmsapi();
    }

    @Override
    public Long loadfrmsapi(Long id) {
        return frmsapiMapper.loadfrmsapi(id);
    }
}
