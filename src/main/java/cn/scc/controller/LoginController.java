package cn.scc.controller;

import cn.scc.entity.Staff;
import cn.scc.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

//    @RequestMapping("/login.do")
//    public String login(Staff staff) {
//        staff loginEmployee = loginService.login(staff);
//        if (null != loginEmployee) {
//            return "index";
//        }
//        return "login";
//    }
}
