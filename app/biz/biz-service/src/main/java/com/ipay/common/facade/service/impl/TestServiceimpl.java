package com.ipay.common.facade.service.impl;

import com.ipay.common.facade.TestService;
import com.ipay.upms.common.dal.dao.TbUserMapper;

public class TestServiceimpl implements TestService {

    private TbUserMapper tbUserMapper;


    @Override
    public void test() {
        System.out.println("" + tbUserMapper.selectByPrimaryKey(1L).getDescription());
    }

    public void setTbUserMapper(TbUserMapper tbUserMapper) {
        this.tbUserMapper = tbUserMapper;
    }
}
