package com.handy.guild.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * 公会解散事件
 *
 * @author handy
 * @since 1.0.0
 */
public class GuildDissolutionEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();
    private final Player player;
    private final Integer guildId;

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    /**
     * 构造器
     *
     * @param player  玩家
     * @param guildId 公会id
     */
    public GuildDissolutionEvent(Player player, Integer guildId) {
        this.player = player;
        this.guildId = guildId;
    }

    /**
     * 获取操作玩家
     *
     * @return 操作玩家
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * 获取公会id
     *
     * @return 公会id
     */
    public Integer getGuildId() {
        return guildId;
    }

    /**
     * 获取公会名称
     *
     * @return 公会名称
     * @since 1.12.9
     */
    public String getGuildName() {
        return "";
    }

    /**
     * 获取无颜色代码的公会名称
     *
     * @return 公会名称
     * @since 1.12.9
     */
    public String getStripColorGuildName() {
        return "";
    }

}