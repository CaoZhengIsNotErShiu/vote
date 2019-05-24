package com.bulin.controller;

import com.bulin.model.VoteOpenId;
import com.bulin.model.VoteOption;
import com.bulin.model.VoteTitle;
import com.bulin.service.VoteServiceI;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2018/9/29.
 */
@Controller
@RequestMapping("vote")
@Api(value = "投票接口")
public class VoteController
{

    @Autowired
    private VoteServiceI voteService;

    /**
     * 查询所有主题
     * @return
     */
    @RequestMapping("queryVoteTitle")
    @ResponseBody
    @ApiOperation(value = "查询所有主题", httpMethod = "GET")
    public List<VoteTitle> queryVoteTitle(){
        List<VoteTitle> voteTitles = voteService.queryVoteTitle();
        return voteTitles;
    }

    /**
     * 获取主题内容
     * @param titleId
     * @return
     */
    @RequestMapping("queryVoteOptionByTitleId")
    @ResponseBody
    @ApiOperation(value = "获取主题内容", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "titleId", value = "主题id", dataType = "int", required = true)
    })
    public List<VoteOption> queryVoteOptionByTitleId(Integer titleId){
        List<VoteOption> voteOptions = voteService.queryVoteOptionByTitleId(titleId);
        return voteOptions;
    }

    /**
     * 投票
     * @param openId
     * @param id
     * @return
     */
    @RequestMapping("addPoll")
    @ResponseBody
    @ApiOperation(value = "投票", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name="openId",value = "微信io",dataType = "String",required = true),
            @ApiImplicitParam(name="id",value = "选手io",dataType = "Integer",required = true)
    })
    public String addPoll(String openId,Integer id){
        VoteTitle voteTitle = voteService.queryVoteTitleByOptionId(id);
        VoteOpenId voteOpenId =voteService.queryVoteOpenIdByOpenIdAndTitleId(voteTitle.getId(),openId);
        if(voteOpenId==null){
            voteService.addPoll(id);
            voteService.addVoteOpenId(voteTitle.getId(),openId);
            return "success";
        }
        return "fail";

    }
}
