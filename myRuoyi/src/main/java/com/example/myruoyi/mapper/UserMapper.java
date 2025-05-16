package com.example.myruoyi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.myruoyi.model.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
