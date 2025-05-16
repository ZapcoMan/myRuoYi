package com.example.myruoyi.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.myruoyi.common.R;
import com.example.myruoyi.model.entity.User;

import java.util.List;

public interface UserService  {
    /**
 * 获取用户列表
 *
 * @return 用户列表
 */
List<User> getUserList();

/**
 * 保存用户信息
 *
 * @param user 待保存的用户对象
 * @return 保存是否成功
 */
boolean saveUser(User user);

/**
 * 根据ID更新用户信息
 *
 * @param user 更新后的用户对象，包含ID
 * @return 更新是否成功
 */
boolean updateById(User user);

/**
 * 根据ID删除用户
 *
 * @param id 用户ID
 * @return 删除是否成功
 */
boolean removeById(Long id);

/**
 * 根据ID获取用户信息
 *
 * @param id 用户ID
 * @return 用户对象，如果未找到则返回null
 */
User getById(Long id);

/**
 * 根据查询条件获取用户列表
 *
 * @param wrapper 查询条件封装对象
 * @return 符合条件的用户列表
 */
List<User> list(QueryWrapper<User> wrapper);

}
