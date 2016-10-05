package org.webonise.springmvcwebapplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.webonise.springmvcwebapplication.Model.Users;
import org.webonise.springmvcwebapplication.Service.UserService;

@Controller
@RequestMapping(value = "/Users")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all")
    public String home(Model model) {
        model.addAttribute("model", userService.findAll());
        return "home";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(@ModelAttribute Users user) {
        userService.save(user);
        return "redirect:/Users/all";
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public String getUser(@RequestParam("userId") int id, Model model) {
        model.addAttribute("model", userService.findById(id));
        return "home";
    }
}
