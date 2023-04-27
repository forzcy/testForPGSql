package com.example.testforpgsql.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("person")
public class UserEntity implements Serializable {
    private int id;
    private String name;
}
