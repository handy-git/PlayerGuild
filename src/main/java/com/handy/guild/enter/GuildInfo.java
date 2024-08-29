package com.handy.guild.enter;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 公会信息
 *
 * @author handy
 */
@Data
public class GuildInfo implements Serializable {

    /**
     * ID
     */
    private Integer id;

    /**
     * 公会名称
     */
    private String guildName;

    /**
     * logoId
     */
    private Integer logoId;

    /**
     * logo
     */
    private String logoName;

    /**
     * 公会介绍
     */
    private String description;

    /**
     * 公会等级
     */
    private Integer level;

    /**
     * 公会资金
     */
    private Integer money;

    /**
     * 公会活跃
     */
    private Integer prosperityDegree;

    /**
     * 月度公会活跃
     */
    private Integer monthProsperityDegree;

    /**
     * 公会神石等级
     */
    private Integer sacredStoneLevel;

    /**
     * 称号id
     */
    private Long titleId;

    /**
     * 公会基地
     */
    private String worldName;

    /**
     * 公会坐标
     */
    private String spawnLocation;

    /**
     * 公会当前人数
     */
    private Integer memberCount;

    /**
     * 公会总人数
     */
    private Integer memberMaxCount;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * pvp状态
     */
    private Boolean pvpStatus;

    /**
     * 加入模式
     */
    private Boolean joinMode;

    /**
     * 矿石
     */
    private Integer ore;

}