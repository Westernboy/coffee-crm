package com.crm.coffee.mapper;

import com.crm.coffee.entity.Member;

/**
 * @author 陈俊旭
 * @description
 * @create 2019/8/26 20:49
 */
public interface MemberMapper {

    Member selectByMemberId(Integer id);


}