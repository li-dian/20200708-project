package com.aaa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author LiDian
 * @createtime 2020/7/15 15:53
 * @desc    用户角色关联表
 **/
@Table(name = "t_user_role")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UserRole implements Serializable {
    /**
     * 用户ID
     */
    @Column(name = "USER_ID")
    private Long userId;

    /**
     * 角色ID
     */
    @Column(name = "ROLE_ID")
    private Long roleId;

}