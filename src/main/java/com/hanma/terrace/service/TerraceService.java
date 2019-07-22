package com.hanma.terrace.service;


import com.hanma.terrace.domain.Terrace;

import java.util.List;

/**
 * Created by p on 2019/7/21.
 */
public interface TerraceService {

    /**
     * 查询
     * name：王辉
     * @return
     */
    List<Terrace> terraceQueryList();

    /**
     * 根据Id查询
     * name:王辉
     * @param merchantId
     * @return
     */
    Terrace getQueryId(Long merchantId);

    /**
     * 修改信息
     * name: 王辉
     * @param terrace
     * @return
     */
    String updateTerrace(Terrace terrace);

    /**
     * 状态删除
     * name：王辉
     * @param merchantId
     */
    void deleteFun(Long merchantId);
}
