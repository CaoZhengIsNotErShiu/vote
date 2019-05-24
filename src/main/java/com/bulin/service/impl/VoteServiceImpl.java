package com.bulin.service.impl;

import com.bulin.mapper.VoteMapper;
import com.bulin.model.VoteOpenId;
import com.bulin.model.VoteOption;
import com.bulin.model.VoteTitle;
import com.bulin.service.VoteServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/9/26.
 */
@Service("voteService")
public class VoteServiceImpl implements VoteServiceI
{

    @Autowired
    private VoteMapper voteMapper;

    @Override
    public List<VoteOption> queryVoteOptionByTitleId(Integer titleId)
    {
        List<VoteOption> voteOptions = null;
        try {
            voteOptions = voteMapper.queryVoteOptionByTitleId(titleId);
        }catch (Exception e){
            throw new RuntimeException("数据库异常");
        }
        return voteOptions;
    }

    @Override
    public List<VoteTitle> queryVoteTitle()
    {
        List<VoteTitle> voteTitles = null;
        try {
            voteTitles = voteMapper.queryVoteTitle();
        }catch (Exception e){
            throw new RuntimeException("数据库异常");
        }
        return voteTitles;
    }

    @Override
    public void addPoll(Integer id)
    {
        voteMapper.addPoll(id);
    }

    @Override
    public VoteTitle queryVoteTitleByOptionId(Integer id)
    {
        VoteTitle voteTitle = null;
        try {
            voteTitle = voteMapper.queryVoteTitleByOptionId(id);
        }catch (Exception e){
            throw new RuntimeException("数据库异常");
        }
        return voteTitle;
    }

    @Override
    public VoteOpenId queryVoteOpenIdByOpenIdAndTitleId(Integer id, String openId)
    {
        VoteOpenId voteOpenId = null;
        try {
            voteOpenId = voteMapper.queryVoteOpenIdByOpenIdAndTitleId(id, openId);
        }catch (Exception e){
            throw new RuntimeException("数据库异常");
        }
        return voteOpenId;
    }

    @Override
    public void addVoteOpenId(Integer id, String openId)
    {
        voteMapper.addVoteOpenId(id, openId);
    }
}
