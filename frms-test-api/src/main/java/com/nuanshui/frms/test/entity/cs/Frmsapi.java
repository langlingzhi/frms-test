package com.nuanshui.frms.test.entity.cs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Frmsapi implements Serializable {
    private Long id;
    private String description;
    private String method;
    private String url;
    private String param;
    private String verify;
    private String status;
}