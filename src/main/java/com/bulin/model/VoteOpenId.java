package com.bulin.model;

import java.io.Serializable;

/**
 * 版    权:  Bulin Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  boye
 *
 * @version [版本号, 2019/5/24 024]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class VoteOpenId implements Serializable
{
    private Integer id;
    private String openId;
    private Integer titleId;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getOpenId()
    {
        return openId;
    }

    public void setOpenId(String openId)
    {
        this.openId = openId;
    }

    public Integer getTitleId()
    {
        return titleId;
    }

    public void setTitleId(Integer titleId)
    {
        this.titleId = titleId;
    }
}
