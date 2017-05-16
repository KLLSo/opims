package me.opims.service.impl;

import me.opims.Enums.Category;
import me.opims.dao.FirmMapper;
import me.opims.model.Firm;
import me.opims.service.EnterPriseManagerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by tb on 17-5-16.
 */
@Service("EnterPriseManagerService")
public class EnterPriseManagerServiceImpl implements EnterPriseManagerService {

    @Resource
    private FirmMapper firmMapper;

    @Override
    public int addEnterprsie(Firm firm) {

        Firm firm1 = firmMapper.selectByPrimaryKey(firm.getIdFirm());
        if(firm1 == null){
            return firmMapper.insert(firm);
        } else if( firm.equals(firm1)){
            return  1;
        }
        return 0;
    }

    @Override
    public List<Firm> getEnterpsriseByName(String name) {
        return firmMapper.selectFirmsByName(name);
    }

    @Override
    public Firm getEnterpriseById(Integer id) {
        return firmMapper.selectByPrimaryKey(id);
    }

    @Override
    public int FreezeEnterpriseById(Integer id) {
        Firm firm = firmMapper.selectByPrimaryKey(id);
        if(firm == null){
            return 0;
        }else if (firm.getCategory() == Category.FREEZE.getScore()){
            return 1;
        }

        firm.setCategory(Category.FREEZE.getScore());
        return firmMapper.updateByPrimaryKeySelective(firm);
    }

    @Override
    public int UnFreezeEnterpriseById(Integer id) {
        Firm firm = firmMapper.selectByPrimaryKey(id);
        if(firm == null){
            return 0;
        }else if (firm.getCategory() == Category.UNFRERZEFIRM.getScore()){
            return 1;
        }

        firm.setCategory(Category.UNFRERZEFIRM.getScore());
        return firmMapper.updateByPrimaryKeySelective(firm);
    }
}
