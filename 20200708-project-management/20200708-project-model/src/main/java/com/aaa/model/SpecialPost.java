package com.aaa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author LiDian
 * @createtime 2020/7/15 15:49
 * @desc    特殊岗位人员信息表
 **/
@Table(name = "t_special_post")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class SpecialPost implements Serializable {
    /**
     * 编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 有效证件号
     */
    @Column(name = "id_number")
    private String idNumber;

    /**
     * 性别 0:女 1:男 2:保密
     */
    private Integer sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 工作年限
     */
    @Column(name = "work_year")
    private Integer workYear;

    /**
     * 毕业院校
     */
    private String school;

    /**
     * 所学专业
     */
    private String major;

    /**
     * 学历
     */
    @Column(name = "education_background")
    private String educationBackground;

    /**
     * 学位
     */
    private String degree;

    /**
     * 特殊岗位
     */
    @Column(name = "special_post")
    private String specialPost;

    /**
     * 单位用户编号
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

}