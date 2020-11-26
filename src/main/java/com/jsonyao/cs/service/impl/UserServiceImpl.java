package com.jsonyao.cs.service.impl;

import com.jsonyao.cs.entity.User;
import com.jsonyao.cs.mapper.UserMapper;
import com.jsonyao.cs.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 用户测试表 服务实现类
 * </p>
 *
 * @author jsonYaoo
 * @since 2020-11-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Resource
    private UserMapper userMapper;

    public List<User> findAllUser(){
        return userMapper.findAllUser();
    }
}
