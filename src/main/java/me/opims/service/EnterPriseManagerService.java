package me.opims.service;

import me.opims.model.Firm;

import java.util.List;

/**
 * Created by tb on 17-5-16.
 */
public interface EnterPriseManagerService {

    int addEnterprsie(Firm firm);

    List<Firm> getEnterpsriseByName(String name);

    Firm getEnterpriseById(Integer id);

    int FreezeEnterpriseById(Integer id);

    int UnFreezeEnterpriseById(Integer id);
}
