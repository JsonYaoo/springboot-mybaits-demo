package com.jsonyao.cs.mapper;

import com.jsonyao.cs.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 用户测试表 Mapper 接口
 * </p>
 *
 * @author jsonYaoo
 * @since 2020-11-26
 */
public interface UserMapper extends BaseMapper<User> {

    public List<User> findAllUser();

}
