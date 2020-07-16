package com.aaa.controller;

import com.aaa.base.BaseService;
import com.aaa.base.CommonController;
import com.aaa.model.LoginLog;
import com.aaa.service.LoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: 20200708-project
 * @author: LiDian
 * @create: 2020-07-15 20:16:39
 **/
@RestController
public class LoginLogController extends CommonController<LoginLog> {

    @Autowired
    private LoginLogService LoginLogService;

    @Override
    public BaseService<LoginLog> getBaseService() {
        return LoginLogService;
    }

    @PostMapping("/addLoginLog")
    public Integer addLoginLog(@RequestBody LoginLog loginLog){
        return getBaseService().add(loginLog);
    }
}