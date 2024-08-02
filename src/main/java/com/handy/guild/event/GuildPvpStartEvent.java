package com.handy.guild.event;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * 匹配公会战 开始事件
 *
 * @author handy
 * @since 1.0.0
 */
public class GuildPvpStartEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();
    private final List<Integer> guildIdList;

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public GuildPvpStartEvent(List<Integer> guildIdList) {
        this.guildIdList = guildIdList;
    }

    /**
     * 获取匹配的公会ids
     *
     * @return 公会ids
     */
    public List<Integer> getGuildIdList() {
        return guildIdList;
    }

}