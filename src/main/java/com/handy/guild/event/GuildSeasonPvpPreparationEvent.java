package com.handy.guild.event;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * 赛季公会战 准备阶段事件
 *
 * @author handy
 * @since 1.0.8
 */
public class GuildSeasonPvpPreparationEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();
    private final List<Integer> guildIdList;
    private final Integer season;

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public GuildSeasonPvpPreparationEvent(List<Integer> guildIdList, Integer season) {
        this.guildIdList = guildIdList;
        this.season = season;
    }

    /**
     * 获取参赛公会ids
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