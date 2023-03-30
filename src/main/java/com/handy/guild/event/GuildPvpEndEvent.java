package com.handy.guild.event;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * 匹配公会战 结束事件
 *
 * @author handy
 * @since 1.0.0
 */
public class GuildPvpEndEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();
    private final Integer failGuildId;
    private final Integer winGuildId;

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public GuildPvpEndEvent(Integer failGuildId, Integer winGuildId) {
        this.failGuildId = failGuildId;
        this.winGuildId = winGuildId;
    }

    /**
     * 获取失败公会id
     *
     * @return 失败公会id
     */
    public Integer getFailGuildId() {
        return failGuildId;
    }

    /**
     * 获取胜利公会id
     *
     * @return 胜利公会id
     */
    public Integer getWinGuildId() {
        return winGuildId;
    }
}