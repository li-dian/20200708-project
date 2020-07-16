package com.aaa.model;
import	java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;

/**
 * @author LiDian
 * @createtime 2020/7/15 15:29
 * @desc    抽查人员信息表
 **/
@Table(name = "t_check_person")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CheckPerson implements Serializable{
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 单位名称
     */
    @Column(name = "unit_name")
    private String unitName;

    /**
     * 职务
     */
    private String duty;

    /**
     * 联系方式
     */
    private String phone;

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

    /**
     * 备注
     */
    private String memo;

}