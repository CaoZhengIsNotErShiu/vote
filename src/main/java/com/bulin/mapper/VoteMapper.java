package com.bulin.mapper;

import com.bulin.model.VoteOpenId;
import com.bulin.model.VoteOption;
import com.bulin.model.VoteTitle;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/10/10.
 */
@Repository
public interface VoteMapper
{
    List<VoteOption> queryVoteOptionByTitleId(@Param("titleId") Integer titleId);
    List<VoteTitle> queryVoteTitle();
    void addPoll(Integer id);
    VoteTitle queryVoteTitleByOptionId(Integer id);
    VoteOpenId queryVoteOpenIdByOpenIdAndTitleId(@Param("id") Integer id,@Param("openId") String openId);
    void addVoteOpenId(@Param("id") Integer id,@Param("openId") String openId);
}
