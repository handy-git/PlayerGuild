package com.handy.guild.event;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * 玩家离开公会事件
 *
 * @author handy
 * @since 1.0.1
 */
public class PlayerLeaveGuildEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();
    private final Player player;

    private final OfflinePlayer offlinePlayer;
    private final Integer guildPlayerId;
    private final String leaveType;

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public PlayerLeaveGuildEvent(Player player, Integer guildPlayerId) {
        this.player = player;
        this.guildPlayerId = guildPlayerId;
        this.leaveType = "activeLeave";
        this.offlinePlayer = null;
    }

    public PlayerLeaveGuildEvent(OfflinePlayer player, Integer guildPlayerId) {
        this.player = null;
        this.guildPlayerId = guildPlayerId;
        this.leaveType = "kickedLeave";
        this.offlinePlayer = player;
    }

    /**
     * 公会玩家id
     *
     * @return 公会玩家id
     */
    public Integer getGuildPlayerId() {
        return guildPlayerId;
    }

    /**
     * 获取主动离开玩家
     *
     * @return 离开玩家
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * 获取被踢离开玩家
     *
     * @return 离开玩家
     * @since 1.9.6
     */
    public OfflinePlayer getOfflinePlayer() {
        return offlinePlayer;
    }

    /**
     * 离开类型
     * 主动离开 activeLeave
     * 被踢离开 kickedLeave
     *
     * @return 类型
     * @since 1.9.4
     */
    public String getLeaveType() {
        return leaveType;
    }

}