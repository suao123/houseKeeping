package cn.cyc.controller;

import cn.cyc.model.User;
import cn.cyc.service.UserSercive;
import cn.cyc.utils.BaseUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@RequestMapping("/users")
@RestController
public class UserApi {

    @Resource
    UserSercive userSercive;

    /**
     * 添加 用户
     * @param user
     * @return
     */
    @PostMapping("")
    public User addUser(@ModelAttribute User user){
        return userSercive.addUser(user);
    }

    /**
     * 获得 所有用户信息
     * @return
     */
    @GetMapping("")
    public List<User> getAll(){
        return userSercive.getAll();
    }

    /**
     * 通过userId获取所有用户信息
     * @param userId
     * @return
     */
    @GetMapping("/{userId}")
    public User getUserById(@PathVariable("userId") int userId){
        return userSercive.getOneById(userId);
    }

    /**
     * 封禁 用户
     * @param userId
     * @return
     */
    @PostMapping("/{userId}/ban")
    public HashMap<String, String> banUser(@PathVariable("userId") int userId) {
        return BaseUtils.getResult(userSercive.banUser(userId));
    }

    /**
     * 解禁 用户
     * @param userId
     * @return
     */
    @PostMapping("/{userId}/unban")
    public HashMap<String, String> unBanUser(@PathVariable("userId") int userId) {
        return BaseUtils.getResult(userSercive.unBanUser(userId));
    }

    /**
     * 修改 用户信息
     * @param user
     * @return
     */
    @PostMapping("/{userId}/profile")
    public HashMap<String, String> updateUser(@ModelAttribute User user) {
        return BaseUtils.getResult(userSercive.updateProfile(user));
    }

    @PostMapping("/check")
    public HashMap<String, String> isUser(@RequestParam("username") String username,
                                          @RequestParam("password") String password) {
        return BaseUtils.getResult(userSercive.isUser(username, password));
    }
}
