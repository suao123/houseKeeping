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

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    Boolean updateProfile(User user);

    /**
     * 判断 是否存在账号
     * @param username
     * @return
     */
    boolean isUser(String username, String password);
}
