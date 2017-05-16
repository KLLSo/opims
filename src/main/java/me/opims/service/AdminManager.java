package me.opims.service;

import java.util.Map;

/**
 * Created by tb on 17-5-15.
 */
public interface AdminManager {

    Map<String,Object> login(String nameAdmin,Integer password);

    void logout(String nameAdmin);

}
