package kr.hs.dgsw.notice_back.Controller;

import kr.hs.dgsw.notice_back.Domain.User;
import kr.hs.dgsw.notice_back.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "/user/signUp")
    public Long addUser(@RequestBody User user){
        return this.userService.add(user);
    }

    @PostMapping(value= "/user/login")
    public User login(@RequestBody User user){
        return this.userService.login(user);
    }

    @PostMapping("/user/check/{account}")
    public User checkAccount(@PathVariable String account){
        return this.userService.checkAccount(account);
    }
}
