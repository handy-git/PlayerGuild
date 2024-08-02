package com.handy.guild.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

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
    private final String guildName;

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    /**
     * 构造器
     *
     * @param player    玩家
     * @param guildId   公会id
     * @param guildName 公会名称
     * @since 1.12.9
     */
    public GuildDissolutionEvent(Player player, Integer guildId, String guildName) {
        this.player = player;
        this.guildId = guildId;
        this.guildName = guildName;
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
        return guildName;
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