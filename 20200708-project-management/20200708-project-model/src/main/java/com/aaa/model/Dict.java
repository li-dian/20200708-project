package com.aaa.model;
import	java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;

/**
 * @author LiDian
 * @createtime 2020/7/15 15:30
 * @desc    字典表
 **/
@Table(name = "t_dict")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Dict implements Serializable{
    /**
     * 字典ID
     */
    @Id
    @Column(name = "DICT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dictId;

    /**
     * 键
     */
    @Column(name = "KEYY")
    private Long keyy;

    /**
     * 值
     */
    @Column(name = "VALUEE")
    private String valuee;

    /**
     * 字段名称
     */
    @Column(name = "FIELD_NAME")
    private String fieldName;

    /**
     * 表名
     */
    @Column(name = "TABLE_NAME")
    private String tableName;

}