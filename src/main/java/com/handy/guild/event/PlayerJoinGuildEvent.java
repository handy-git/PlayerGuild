package com.handy.guild.event;

import lombok.Getter;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.UUID;

/**
 * 玩家加入公会事件
 *
 * @author handy
 * @since 1.9.7
 */
public class PlayerJoinGuildEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();
    @Getter
    private final String playerName;
    @Getter
    private final UUID playerUuid;
    @Getter
    private final Integer guildInfoId;

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public PlayerJoinGuildEvent(String playerName, UUID playerUuid, Integer guildInfoId) {
        this.playerName = playerName;
        this.playerUuid = playerUuid;
        this.guildInfoId = guildInfoId;
    }

}