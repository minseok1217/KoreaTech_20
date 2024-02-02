package koreatech20.koreatech20.controller;

import koreatech20.koreatech20.domain.User;
import koreatech20.koreatech20.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/users/new")
    public String createForm(){
        return "users/createUserForm";
    }

    @PostMapping("/users/new")
    public String create(UserForm form){
        User user = new User();
        user.setName(form.getName());

        userService.join(user);

        return "redirect:/login";
    }

    @GetMapping("/users")
    public String list(Model model){
        List<User> users = userService.findUsers();
        model.addAttribute("users", users);
        return "users/userList";
    }
}
