package com.nuanshui.frms.test.csservice;

import com.nuanshui.frms.test.entity.cs.User;

import java.util.List;

public interface UserService {
    List<User> queryUserLogin(String username);
}
