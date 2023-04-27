package com.example.testforpgsql.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.testforpgsql.entity.UserEntity;

public interface UserService extends IService<UserEntity> {

    UserEntity getInfo();

}
