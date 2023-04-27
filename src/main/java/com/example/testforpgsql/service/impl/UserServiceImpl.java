package com.example.testforpgsql.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.support.SFunction;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.testforpgsql.dao.UserDao;
import com.example.testforpgsql.entity.UserEntity;
import com.example.testforpgsql.service.UserService;
import org.springframework.stereotype.Service;

@Service("useService")
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {

    @Override
    public UserEntity getInfo() {
//        LambdaQueryWrapper<UserEntity> wrapper = new LambdaQueryWrapper<>();
//        wrapper.eq(userEntity -> userEntity.getId()==1,"id");
        QueryWrapper<UserEntity> wrapper = new QueryWrapper<>();
        wrapper.eq("id", 1);
        UserEntity one = this.getOne(wrapper);
        return one;
    }
}
