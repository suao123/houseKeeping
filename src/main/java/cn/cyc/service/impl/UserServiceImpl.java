package cn.cyc.service.impl;

import cn.cyc.constant.UserContant;
import cn.cyc.mapper.UserMapper;
import cn.cyc.model.User;
import cn.cyc.service.UserSercive;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserSercive {

    @Resource
    UserMapper userMapper;

    @Override
    public User getOneById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> getAll() {
        return userMapper.selectAll();
    }

    @Override
    public User addUser(User user) {
        user.setCreated(System.currentTimeMillis());
        userMapper.insert(user);
        return user;
    }

    @Override
    public boolean banUser(int id) {
        User user = userMapper.selectByPrimaryKey(id);
        user.setBan(UserContant.BAN);
        userMapper.updateByPrimaryKey(user);
        return true;
    }

    @Override
    public boolean unBanUser(int id) {
        User user = userMapper.selectByPrimaryKey(id);
        user.setBan(UserContant.FREE);
        userMapper.updateByPrimaryKey(user);
        return true;
    }
}
