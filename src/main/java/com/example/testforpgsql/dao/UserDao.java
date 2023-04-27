package com.example.testforpgsql.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.testforpgsql.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<UserEntity> {

}
