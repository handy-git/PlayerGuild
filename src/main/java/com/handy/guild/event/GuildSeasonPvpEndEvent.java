package com.handy.guild.event;

import com.handy.guild.param.GuildSeasonPvpPlayerParam;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.List;

/**
 * 赛季公会战 结束事件
 *
 * @author handy
 * @since 1.0.8
 */
public class GuildSeasonPvpEndEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();
    private final Integer guildId;
    private final Integer rank;
    private final List<GuildSeasonPvpPlayerParam> playerParams;
    private final Integer season;

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public GuildSeasonPvpEndEvent(Integer guildId, Integer rank, List<GuildSeasonPvpPlayerParam> playerParams, Integer season) {
        this.guildId = guildId;
        this.rank = rank;
        this.playerParams = playerParams;
        this.season = season;
    }

    /**
     * 获取参赛公会ids
     *
     * @return 公会ids
     */
    public Integer getGuildId() {
        return guildId;
    }

    /**
     * 获取参赛公会 玩家集合
     *
     * @return 玩家集合
     */
    public List<GuildSeasonPvpPlayerParam> getPlayerParams() {
        return playerParams;
    }

    /**
     * 获取排名
     *
     * @return 排名
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * 获取当前赛季
     *
     * @return 当前赛季
     * @since 1.4.1
     */
    public Integer getSeason() {
        return season;
    }

}