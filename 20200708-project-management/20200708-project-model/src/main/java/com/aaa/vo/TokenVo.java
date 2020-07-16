package com.aaa.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @program: 20200708-project
 * @author: LiDian
 * @create: 2020-07-15 20:07:45
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class TokenVo implements Serializable {

    private String token;
    private Boolean ifSuccess;
    /**
     * @author LiDian
     * @createtime 2020/7/15 20:09
     * @desc
     *      1.账号不存在 2.密码错误 3.账号被锁定 4.系统异常
     **/
    private Integer type;
}