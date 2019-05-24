package com.bulin.service;

import com.bulin.model.VoteOpenId;
import com.bulin.model.VoteOption;
import com.bulin.model.VoteTitle;

import java.util.List;

/**
 * Created by Administrator on 2018/9/26.
 */
public interface VoteServiceI
{
    /**
     * 每个主题的所有选手
     * @param titleId 主题id
     * @return
     */
    List<VoteOption> queryVoteOptionByTitleId(Integer titleId);

    /**
     * 所有的投票主题
     * @return
     */
    List<VoteTitle> queryVoteTitle();

    /**
     * 投票+1
     * @param id  选手id
     */
    void addPoll(Integer id);

    /**
     * 通过选手id得到他参与的主题投票
     * @param id 选手id
     * @return
     */
    VoteTitle queryVoteTitleByOptionId(Integer id);

    /**
     * 通过选手id和微信的openid（用来判断是否已经投过票了）
     * @param id 选手id
     * @param openId 微信
     * @return
     */
    VoteOpenId queryVoteOpenIdByOpenIdAndTitleId(Integer id, String openId);

    /**
     * 记录已经投票的微信
     * @param id 选手id
     * @param openId 微信
     */
    void addVoteOpenId(Integer id, String openId);
}
