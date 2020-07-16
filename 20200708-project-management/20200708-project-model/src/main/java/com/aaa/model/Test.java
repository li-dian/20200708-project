package com.aaa.model;
import	java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author LiDian
 * @createtime 2020/7/15 15:51
 * @desc    测试表
 **/
@Table(name = "t_test")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Test implements Serializable{
    @Column(name = "FIELD1")
    private String field1;

    @Column(name = "FIELD2")
    private Integer field2;

    @Column(name = "FIELD3")
    private String field3;

    @Column(name = "CREATE_TIME")
    private Date createTime;

}