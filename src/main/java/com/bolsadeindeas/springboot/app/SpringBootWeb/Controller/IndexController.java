package com.bolsadeindeas.springboot.app.SpringBootWeb.Controller;


import com.bolsadeindeas.springboot.app.SpringBootWeb.Models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class IndexController {

    @GetMapping({"/index", "/", "/home"})
    public String index(Model model) {

        model.addAttribute("Title", "welcome my page whith map");

        return "index";
    }

    @RequestMapping("/profile")
    public String profile(Model model) {

        User user = new User();
        user.setName("Carlos");
        user.setLastName("Luna");

        model.addAttribute("User", user);
        model.addAttribute("Title", "profile of user: ".concat(user.getName()));


        return "profile";
    }
}
