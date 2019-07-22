package com.hanma.terrace.controller;
import com.hanma.terrace.domain.ResultVO;
import com.hanma.terrace.domain.Terrace;
import com.hanma.terrace.service.TerraceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by p on 2019/7/21.
 */
@Controller
@RequestMapping("terrace")
public class TerraceController {



    @Autowired
    private TerraceService terraceService;


    /**
     * 查询
     * name 王辉
     * @return
     */


    @RequestMapping("terraceQueryList")
    @ResponseBody
    public List<Terrace> terraceQueryList(){
        List <Terrace> terraceList = terraceService.terraceQueryList();
        return terraceList;
    }


    /**
     * 根据Id查询
     * name 王辉
     * @return
     */


    @RequestMapping("getQueryId")
    @ResponseBody
    public Terrace getQueryId(Long merchantId){
        return  terraceService.getQueryId(merchantId);
    }



/**
     * 修改信息
     * name 王辉
     * @param terrace
     * @return
    */
    @RequestMapping("updateTerrace")
    @ResponseBody
    public String updateTerrace(@RequestBody Terrace terrace){
        return terraceService.updateTerrace(terrace);
    }


    /**
     * 状态删除
     * name:王辉
     * @param merchantId
     * @return
     */
    @RequestMapping("deleteFun")
    @ResponseBody
    public ResultVO deleteFun(Long merchantId){
        ResultVO rv = new ResultVO();
        try {
            terraceService.deleteFun(merchantId);
            rv.setMsg("删除成功");
        }catch (Exception e){
            rv.setMsg("删除失败");
        }
        return rv;
    }
}
