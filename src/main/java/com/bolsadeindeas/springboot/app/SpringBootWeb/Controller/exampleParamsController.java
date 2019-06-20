package com.bolsadeindeas.springboot.app.SpringBootWeb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/params" )
@Controller
public class exampleParamsController {

    @GetMapping("/")
    public String index() {
        return "params/index";
    }

    @GetMapping("/string")
    public String param(@RequestParam(name="text", required = false) String text, Model model) {

        model.addAttribute("result","The text sent is: "+text);
        return "params/see";
    }

    @GetMapping("/mix-params")
    public String param(@RequestParam String greeting, @RequestParam Integer number, Model model) {

        model.addAttribute("result","The greeting sent is: '"+greeting+"' and the number is '"+number+"'");
        return "params/see";
    }

    @GetMapping("/mix-params-request")
    public String param(HttpServletRequest request, Model model) {
        String greeting = request.getParameter("greting");
        Integer number = null;
        try {
            number = Integer.parseInt(request.getParameter("number"));
        } catch (NumberFormatException e) {
            number = 0;
        }
        model.addAttribute("result","The greeting sent is: '"+greeting+"' and the number is '"+number+"'");
        return "params/see";
    }
}
