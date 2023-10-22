package yonk.dev.lab_week06.frontend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import yonk.dev.lab_week06.backend.services.UserService;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public String getAllUser(Model model) {
        model.addAttribute("users", userService.getAllUser());
        return "user/users";
    }
}
