package com.handy.guild.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * 匹配公会战 匹配事件
 *
 * @author handy
 * @since 1.0.0
 */
public class GuildPvpMatchEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();
    private final Integer guildId;
    private final Player player;

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public GuildPvpMatchEvent(Player player, Integer guildId) {
        this.player = player;
        this.guildId = guildId;
    }

    /**
     * 获取匹配公会id
     *
     * @return 公会id
     */
    public Integer getGuildId() {
        return guildId;
    }

    /**
     * 获取匹配玩家
     *
     * @return 玩家
     */
    public Player getPlayer() {
        return player;
    }

}