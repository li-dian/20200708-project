package com.aaa.service;

import com.aaa.base.ResultData;
import com.aaa.model.LoginLog;
import com.aaa.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author LiDian
 * @date 2020/7/15 19:56
 */
@FeignClient(value = "")
public interface IProjectService {

    /**
     * @author LiDian
     * @createtime 2020/7/15 19:59
     * @desc    执行登录操作
     **/
    @PostMapping("/doLogin")
    ResultData doLogin(@RequestBody User user);

    /**
     * @author LiDian
     * @createtime 2020/7/15 20:00
     * @desc    新增日志
     **/
    @PostMapping("/addLoginLog")
    Integer addLoginLog(@RequestBody LoginLog loginLog);
}
