package com.handy.guild.event;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.List;

/**
 * 匹配公会战 准备事件
 *
 * @author handy
 * @since 1.0.0
 */
public class GuildPvpPreparationEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final List<Integer> guildIdList;

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public GuildPvpPreparationEvent(List<Integer> guildIdList) {
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