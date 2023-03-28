package com.handy.guild.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * 匹配死亡事件
 *
 * @author handy
 * @since 1.6.2
 */
public class GuildSeasonPvpDeathEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();
    private final Player player;
    private final Player killer;

    /**
     * 构造器
     *
     * @param player 死亡玩家
     * @param killer 击杀玩家
     */
    public GuildSeasonPvpDeathEvent(Player player, Player killer) {
        this.player = player;
        this.killer = killer;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    /**
     * 获取死亡玩家
     *
     * @return 死亡玩家
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * 获取击杀玩家(有可能为null)
     *
     * @return 击杀玩家
     */
    public Player getKiller() {
        return killer;
    }
}