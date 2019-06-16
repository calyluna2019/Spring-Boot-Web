package com.bolsadeindeas.springboot.app.SpringBootWeb.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"/index", "/", "/home"})
    public String index(Model model) {

        model.addAttribute("Titulo", "Bienvenido a mi pagina con map");

        return "index";
    }
}
