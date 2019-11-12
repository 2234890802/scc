package cn.scc.controller;

import cn.scc.entity.Staff;
import cn.scc.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    @ResponseBody
    @RequestMapping("/login.do")
    public ModelAndView login(HttpSession session, Staff staff) throws IOException {
        Staff loginStaff = loginService.Login(staff);
        ModelAndView mav = new ModelAndView();
        if (null != loginStaff) {
            session.setAttribute("staff", loginStaff);
            mav.addObject("staff", loginStaff);
            mav.setViewName("index");
            System.out.println(mav.getModel());
            return mav;
//            response.sendRedirect(request.getContextPath()+"index.html");
//            request.getRequestDispatcher("index.html").forward(request,response);
        } else {
//            response.sendRedirect(request.getContextPath()+"login.html");
//            model.addAttribute("error", "登录失败");
            mav.setViewName("login");
            return mav;
        }
    }

//    @RequestMapping("/index.do")
//    public String index(HttpSession session){
//
//        return "index";
//    }
}
