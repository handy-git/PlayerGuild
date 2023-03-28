package com.handy.guild.event;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.List;

/**
 * 赛季公会战 开始事件
 *
 * @author handy
 * @since 1.0.8
 */
public class GuildSeasonPvpStartEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();
    private final List<Integer> guildIdList;
    private final Integer season;

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public GuildSeasonPvpStartEvent(List<Integer> guildIdList, Integer season) {
        this.guildIdList = guildIdList;
        this.season = season;
    }

    /**
     * 获取匹配的公会ids
     *
     * @return 公会ids
     */
    public List<Integer> getGuildIdList() {
        return guildIdList;
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