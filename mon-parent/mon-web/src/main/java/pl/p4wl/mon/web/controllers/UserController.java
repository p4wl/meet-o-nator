package pl.p4wl.mon.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.p4wl.mon.UserService;

@Controller("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/new")
    public void newUser(@RequestParam String username, @RequestParam String password) {
        userService.addUser(username, password);
    }

}
