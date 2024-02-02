package koreatech20.koreatech20.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Koreatech20Controller {

    @GetMapping("hello")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/login")
    public String home(){
        return "login";
    }

    @GetMapping("/book")
    public String book(){
        return "book";
    }
}
