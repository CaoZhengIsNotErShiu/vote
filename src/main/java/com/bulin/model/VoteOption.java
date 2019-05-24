package com.bulin.model;

import java.io.Serializable;

/**
 * 版    权:  Bulin Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  boye
 *
 * @version [版本号, 2019/5/23 023]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class VoteOption implements Serializable
{
    private Integer id;
    private String option;
    private String description;
    private Integer poll;
    private Integer titleId;
    private String image;


    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getOption()
    {
        return option;
    }

    public void setOption(String option)
    {
        this.option = option;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Integer getPoll()
    {
        return poll;
    }

    public void setPoll(Integer poll)
    {
        this.poll = poll;
    }

    public Integer getTitleId()
    {
        return titleId;
    }

    public void setTitleId(Integer titleId)
    {
        this.titleId = titleId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
