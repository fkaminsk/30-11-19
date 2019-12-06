package pl.edu.wszib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pl.edu.wszib.model.User;

@Controller
public class LoginController {

    @RequestMapping(value = "/login_page", method = RequestMethod.GET) //oblsuguje tylko rzadania typu get
    public ModelAndView loginPage(){
        return new ModelAndView("loginPage", "userkey", new User());
    }

    @RequestMapping(value = "/login_page", method = RequestMethod.POST)
    public String loginForm(@ModelAttribute("userkey") User user){
        if(user.getLogin().equals("admin") && user.getPass().equals("admin123")){
            return "redirect:index";
        }
        else{
            return "loginPage";
        }
    }
    @RequestMapping(value="/index",method = RequestMethod.GET)
    public String index(){
        return "index";
    }
}
