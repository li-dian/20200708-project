package com.aaa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author LiDian
 * @createtime 2020/7/15 15:52
 * @desc    用户设置风格表
 **/
@Table(name = "t_user_config")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UserConfig implements Serializable {
    /**
     * 用户ID
     */
    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    /**
     * 系统主题 dark暗色风格，light明亮风格
     */
    @Column(name = "THEME")
    private String theme;

    /**
     * 系统布局 side侧边栏，head顶部栏
     */
    @Column(name = "LAYOUT")
    private String layout;

    /**
     * 页面风格 1多标签页 0单页
     */
    @Column(name = "MULTI_PAGE")
    private String multiPage;

    /**
     * 页面滚动是否固定侧边栏 1固定 0不固定
     */
    @Column(name = "FIX_SIDERBAR")
    private String fixSiderbar;

    /**
     * 页面滚动是否固定顶栏 1固定 0不固定
     */
    @Column(name = "FIX_HEADER")
    private String fixHeader;

    /**
     * 主题颜色 RGB值
     */
    @Column(name = "COLOR")
    private String color;

}