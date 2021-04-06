package cn.cyc.service;

import cn.cyc.model.User;

import java.util.List;

/**
 * @author cyc
 */
public interface UserSercive {


    /**
     * 根据 id返回数据
     * @param id
     * @return
     */
    User getOneById(int id);

    /**
     * 返回 所有用户信息
     * @return
     */
    List<User> getAll();

    /**
     * 添加 用户
     * @param user
     * @return
     */
    User addUser(User user);

    /**
     * 封禁 用户
     * @param id
     * @return
     */
    boolean banUser(int id);

    /**
     * 解禁 用户
     * @param id
     * @return
     */
    boolean unBanUser(int id);
}