package com.handy.guild.param;

import lombok.Data;

import java.util.UUID;

/**
 * 赛季公会战 玩家参数
 *
 * @author handy
 */
@Data
public class GuildSeasonPvpPlayerParam {

    /**
     * 自己公会id
     */
    private Integer meGuildId;

    /**
     * 玩家名称
     */
    private String playerName;

    /**
     * 玩家uui
     */
    private UUID playerUuid;

    /**
     * 玩家击杀数量
     */
    private Integer kill;

    /**
     * 是否死亡 true是死亡
     */
    private Boolean isDeath;

    /**
     * 赛季
     */
    private Integer season;

}