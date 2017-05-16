package me.opims.service.impl;

import me.opims.dao.AdminMapper;
import me.opims.dao.LoginMapper;
import me.opims.model.Admin;
import me.opims.model.Login;
import me.opims.service.AdminManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by tb on 17-5-15.
 */
@Service("AdminManager")
public class AdminManagerImpl implements AdminManager {

    @Resource
    private AdminMapper adminMapper;
    @Resource
    private LoginMapper loginMapper;
    @Override
    public Map<String, Object> login(String nameAdmin, Integer password) {

        Login login = loginMapper.selectByPrimaryKey(nameAdmin);
        Map<String ,Object> map  = new HashMap<>();
        if(login == null){
            map.put("msg","账号错误");
            return map;
        }
        if(!login.getPassword().equals(password)){
            map.put("msg","密码错误");
            return map;
        }
        if(login.getCategory() != 3){
            map.put("msg","权限错误");
            return map;
        }
        map.put("admin",adminMapper.selectByNameAdmin(nameAdmin));
        return map;
    }

    @Override
    public void logout(String nameAdmin) {

    }
}
