package com.nuanshui.frms.test.csmapper;

import com.nuanshui.frms.test.entity.cs.Frmsapi;

import java.util.List;

public interface FrmsapiMapper {
    Long getfrmsapi(Frmsapi frmsapi);
    List<Frmsapi> queryfrmsapi();
    Long loadfrmsapi(Long id);
}
