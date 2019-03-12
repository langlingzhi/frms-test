package com.nuanshui.frms.test.entity.cs;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MessageList implements Serializable {
    private Long id;
    private String message_order_no;
    private String order_no;
    private String loan_person;
    private String telphone;
    private String dispatch_user;
    private String message_content;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date message_create_time;
    private String message_source;

}
