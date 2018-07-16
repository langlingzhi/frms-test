package com.nuanshui.frms.test.csservice;

import com.nuanshui.frms.test.entity.cs.Frmsapi;

import java.util.List;

public interface FrmsapiService {
    Long getfrmsapi(Frmsapi frmsapi);
    List<Frmsapi> queryfrmsapi( );
    Long loadfrmsapi(Long id);
}
