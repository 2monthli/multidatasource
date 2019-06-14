package cn.plus.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.plus.boot.annotation.DataSource;
import cn.plus.boot.entity.User;
import cn.plus.boot.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@DataSource(value="master")
	@GetMapping(value="/find1")
    public User find() {
        return userService.get(1l);
    }
    
    @DataSource(value="cluster")
    @GetMapping(value="/find2")
    public User find2() {
        return userService.get(1l);
    }
}
