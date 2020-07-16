package com.aaa.controller;

import com.aaa.annotation.LoginAnnotation;
import com.aaa.base.BaseController;
import com.aaa.base.ResultData;
import com.aaa.model.User;
import com.aaa.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: 20200708-project
 * @author: LiDian
 * @create: 2020-07-15 19:38:26
 **/
@RestController
public class LoginController extends BaseController {

    @Autowired
    private IProjectService projectService;

    /**
     * @author LiDian
     * @createtime 2020/7/15 19:55
     * @desc    执行登录操作
     **/
    @PostMapping("/doLogin")
    @LoginAnnotation(operationType = "登录操作", operationName = "管理员登录")
    public ResultData doLogin(User user) {
        return projectService.doLogin(user);
    }
}