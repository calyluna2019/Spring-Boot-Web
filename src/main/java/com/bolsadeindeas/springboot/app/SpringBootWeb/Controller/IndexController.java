package com.bolsadeindeas.springboot.app.SpringBootWeb.Controller;


import com.bolsadeindeas.springboot.app.SpringBootWeb.Models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Arrays;
import java.util.List;

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
        user.setEmail("cgl_8791@hotmail.com");

        model.addAttribute("User", user);
        model.addAttribute("Title", "profile of user: ".concat(user.getName()));

        return "profile";
    }

    @RequestMapping("/toList")
    public String toList(Model model) {

        model.addAttribute("Title", "list of users");

        return "toList";
    }

    @ModelAttribute("users")
    public List<User> poblarUser() {

        List<User> users = Arrays.asList(new User("Carlos", "Luna", "cgl_8791@hotmail.com"),
                new User("Alejandra", "Nieva", "djhdfj@hotmail.com"),
                new User("Valentina", "Luna", "34kfgf@hotmail.com"));

        return users;


    }
}
