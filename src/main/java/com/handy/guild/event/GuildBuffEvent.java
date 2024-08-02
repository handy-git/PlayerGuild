package com.handy.guild.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * 公会buff事件
 *
 * @author handy
 * @since 1.9.4
 */
public class GuildBuffEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();
    private final Player player;
    private final List<String> buffList;

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public GuildBuffEvent(Player player, List<String> buffList) {
        this.player = player;
        this.buffList = buffList;
    }

    /**
     * 获取Player
     *
     * @return Player
     */
    public Player getPlayer() {
        return this.player;
    }

    /**
     * 获取全部buff信息
     *
     * @return buff信息
     */
    public List<String> getBuffList() {
        return this.buffList;
    }

}