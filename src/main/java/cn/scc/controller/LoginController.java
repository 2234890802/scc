package cn.scc.controller;

import cn.scc.entity.Employee;
import cn.scc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/login.do")
    public String login(Employee employee) {
        Employee loginEmployee = employeeService.login(employee);
        if (null != loginEmployee) {
            return "index";
        }
        return "login";
    }
}
