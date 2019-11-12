package cn.scc.service.impl;

import cn.scc.entity.Staff;
import cn.scc.mapper.StaffMapper;
import cn.scc.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Program: scc
 * Package: cn.scc.service.impl
 * Description:登录业务
 *
 * @Author: ZL
 * @Date: 2019-11-12 10:53
 */

@Service("loginServiceImpl")
public class LoginServiceImpl implements LoginService {

    @Autowired
    private StaffMapper staffMapper;

    public Staff Login(Staff staff) {
        Staff loginStaff = staffMapper.Login(staff);
        return loginStaff;
    }
}
