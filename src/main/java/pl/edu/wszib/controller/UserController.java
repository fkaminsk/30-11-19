package pl.edu.wszib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.edu.wszib.model.User;
import pl.edu.wszib.repository.UsersRepository;

@Controller
public class UserController {

    @Autowired
    UsersRepository usersRepository;

    @RequestMapping(value="/users",method= RequestMethod.GET)
    public String userPage(Model model)  { //model to nosnik danych miedzy controllerem a htmlem


        model.addAttribute("userlist", this.usersRepository.getUserList());
        return "users";
    }
}
