package com.hanma.terrace.service.Impl;

import com.hanma.terrace.domain.Terrace;
import com.hanma.terrace.mapper.TerraceMapper;
import com.hanma.terrace.service.TerraceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by p on 2019/7/21.
 */
@Service
public class TerraceServiceImpl implements TerraceService {


    @Autowired
    private TerraceMapper terraceMapper;


    /**
     * 查询
     * name：王辉
     * @return
     */
    @Override
    public List<Terrace> terraceQueryList() {
        return terraceMapper.terraceQueryList();
    }

    @Override
    public Terrace getQueryId(Long merchantId) {
        return terraceMapper.selectByPrimaryKey(merchantId);
    }


    /**
     * 修改
     * name ：王辉
     * @param terrace
     * @return
     */
    @Override
    public String updateTerrace(Terrace terrace) {
        terrace.setMerchantUpdateTime(new Date());
        terrace.setMerchantYn(1);
        terraceMapper.updateByPrimaryKeySelective(terrace);
        return "修改成功";
    }

    @Override
    public void deleteFun(Long merchantId) {
        terraceMapper.deleteFun(merchantId);
    }
}
