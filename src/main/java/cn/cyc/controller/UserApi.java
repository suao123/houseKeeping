package cn.cyc.controller;

import cn.cyc.model.User;
import cn.cyc.service.UserSercive;
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
        HashMap<String, String> result = new HashMap<>();
        if (userSercive.banUser(userId)) {
            result.put("msg", "true");
        } else {
            result.put("msg", "true");
        }
        return result;
    }

    /**
     * 解禁 用户
     * @param userId
     * @return
     */
    @PostMapping("/{userId}/unban")
    public HashMap<String, String> unBanUser(@PathVariable("userId") int userId) {
        HashMap<String, String> result = new HashMap<>();
        if (userSercive.unBanUser(userId)) {
            result.put("msg", "true");
        } else {
            result.put("msg", "true");
        }
        return result;
    }

    @PostMapping("/{userId}/profile")
    public HashMap<String, String> updateUser(@ModelAttribute User user) {
        HashMap<String, String> result = new HashMap<>();
        if (userSercive.updateProfile(user)) {
            result.put("msg", "true");
        } else {
            result.put("msg", "true");
        }
        return result;
    }
}
