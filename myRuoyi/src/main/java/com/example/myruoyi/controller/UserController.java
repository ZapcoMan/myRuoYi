package com.example.myruoyi.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.myruoyi.common.R;
import com.example.myruoyi.model.entity.User;
import com.example.myruoyi.service.UserService;
import io.swagger.annotations.ApiOperation;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService userService;

    @ApiOperation("获取用户列表")
    @GetMapping("/getUserList")
    public R getUserList() {
        return R.ok().data("UserList", userService.getUserList());
    }

    @ApiOperation("添加用户")
    @PostMapping("/add")
    public R add(@RequestBody User user) {
        if (userService.saveUser(user)) {
            return R.error().message("添加用户失败");
        }
        return R.ok();
    }

    @ApiOperation("更新用户")
    @PutMapping("/update")
    public R update(@RequestBody User user) {
        return R.ok().data("User", userService.updateById(user));
    }

    @ApiOperation("根据ID删除用户")
    @DeleteMapping("/deleteById")
    public R deleteById(@RequestParam Long id) {
        if (userService.removeById(id)){
            return R.error().message("删除出错了");
        }
        return R.ok();
    }

    @ApiOperation("根据ID获取用户信息")
    @GetMapping("/getUserById")
    public User getUserById(@RequestParam Long id) {
        return userService.getById(id);
    }

    @ApiOperation("根据用户名模糊查询用户列表")
    @GetMapping("/query")
    public List<User> query(@RequestParam String username) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.like("username", username);
        return userService.list(wrapper);
    }
}


