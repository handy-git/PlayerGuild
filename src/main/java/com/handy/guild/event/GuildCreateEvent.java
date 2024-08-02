package com.handy.guild.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * 公会创建事件
 *
 * @author handy
 * @since 1.0.0
 */
public class GuildCreateEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();
    private final Player player;
    private final String guildName;

    /**
     * 构造器
     *
     * @param player    玩家
     * @param guildName 公会名
     */
    public GuildCreateEvent(Player player, String guildName) {
        this.player = player;
        this.guildName = guildName;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }

    /**
     * 获取创建玩家
     *
     * @return 创建玩家
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * 获取公会名
     *
     * @return 公会名
     */
    public String getGuildName() {
        return guildName;
    }

}