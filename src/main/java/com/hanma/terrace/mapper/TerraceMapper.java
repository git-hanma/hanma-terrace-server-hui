package com.hanma.terrace.mapper;

import com.hanma.terrace.domain.Terrace;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TerraceMapper {
    int deleteByPrimaryKey(Long merchantId);

    int insert(Terrace record);

    int insertSelective(Terrace record);

    Terrace selectByPrimaryKey(Long merchantId);

    int updateByPrimaryKeySelective(Terrace record);

    int updateByPrimaryKeyWithBLOBs(Terrace record);

    int updateByPrimaryKey(Terrace record);

    /**
     * 查询
     * name 王辉
     * @return
     */
    List<Terrace> terraceQueryList();

    void deleteFun(Long merchantId);
}