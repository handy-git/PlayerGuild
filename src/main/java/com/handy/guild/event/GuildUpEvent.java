package com.handy.guild.event;

import com.handy.guild.enter.GuildInfo;
import lombok.Getter;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * 公会升级事件
 * 事件可取消，取消后公会不会升级
 * 该事件公会插件默认监听NORMAL等级，如需取消请监听更低等级并自定义处理逻辑
 *
 * @author handy
 * @since 1.13.5
 */
@Getter
public class GuildUpEvent extends Event implements Cancellable {
    private static final HandlerList HANDLERS = new HandlerList();
    private boolean cancelled;
    /**
     * 公会
     */
    private final GuildInfo guildInfo;
    /**
     * 升级后的等级
     */
    private final Integer newLevel;

    /**
     * 构造器
     *
     * @param guildInfo 公会
     * @param newLevel  新等级
     */
    public GuildUpEvent(GuildInfo guildInfo, Integer newLevel) {
        this.guildInfo = guildInfo;
        this.newLevel = newLevel;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

}