package com.crm.coffee.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author 陈俊旭
 * @description
 * @create 2019/8/26 20:49
 */
@Data
public class Member {
    private Integer id;

    /**
     * 会员id
     */
    private String memberId;

    /**
     * 会员姓名
     */
    private String memberName;

    /**
     * 0是男1是女
     */
    private String sex;

    /**
     * 会员电话
     */
    private String memberPhone;

    /**
     * 会员积分
     */
    private Long memberScore;

    /**
     * 注册时间
     */
    private Date registerTime;

    /**
     * 会员生日
     */
    private String birthday;

    /**
     * 会员办理店铺id
     */
    private Integer registerShopId;

    /**
     * 会员卡等级
     */
    private String memberLevel;


}