package me.opims.service;

import me.opims.model.User;

import java.util.List;

/**
 * Created by tb on 17-5-15.
 */
public interface UserManager {

    List<User> getUserByName(String name);

    User getUserById(Integer id);

    int FreezeUserById(Integer id);

    int UnFreezeUserById(Integer id);
}
