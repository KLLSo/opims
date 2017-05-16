package me.opims.service.impl;

import me.opims.Enums.Category;
import me.opims.dao.UserMapper;
import me.opims.model.User;
import me.opims.service.UserManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by tb on 17-5-15.
 */
@Service("UserManager")
public class UserManagerImpl implements UserManager {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getUserByName(String name) {
        return userMapper.selectUsersByname(name);
    }

    @Override
    public User getUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int FreezeUserById(Integer id) {
        return userMapper.updateUserCategoryById(id, Category.FREEZE.getScore());
    }

    @Override
    public int UnFreezeUserById(Integer id) {
        return userMapper.updateUserCategoryById(id,Category.UNFREEZE.getScore());
    }


}
