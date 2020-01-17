package controller;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserService;

/**
*@Author DoubleC
*@Description TODO
*@Date 2019/12/23 13:42
**/
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/mvc")
    public String testMvc(){
        User user = userService.test(1);
        return user.toString();
    }

    @ResponseBody
    @RequestMapping("/mvd")
    public String testMvc2(){
        return "hello spring!";
    }

}
