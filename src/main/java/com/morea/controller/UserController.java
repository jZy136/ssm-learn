package com.morea.controller;

import com.morea.model.User;
import com.morea.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/queryAllUser",method = RequestMethod.GET)
    @ResponseBody
    public String list(Model model){

        List<User> users = userService.queryAllUser();
        model.addAttribute("users",users);


        return "userlist";

    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(Model model){

        model.addAttribute("msg","nihao");
        return "index";

    }


}
