package com.jsonyao.cs.service;

import com.jsonyao.cs.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户测试表 服务类
 * </p>
 *
 * @author jsonYaoo
 * @since 2020-11-26
 */
public interface IUserService extends IService<User> {

    public List<User> findAllUser();

}
