package com.handy.guild.event;

import org.bukkit.OfflinePlayer;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.List;
import java.util.Map;

/**
 * 清理月度奖励
 *
 * @author handy
 * @since 1.8.1
 */
public class GuildClearMonthProsperityDegreeEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();
    private final Map<Integer, List<OfflinePlayer>> member;
    private final String guildName;

    /**
     * 构造器
     *
     * @param member    成员
     * @param guildName 公会名
     */
    public GuildClearMonthProsperityDegreeEvent(Map<Integer, List<OfflinePlayer>> member, String guildName) {
        this.member = member;
        this.guildName = guildName;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    /**
     * 获取成员
     * key 成员角色 value 成员
     *
     * @return 成员
     */
    public Map<Integer, List<OfflinePlayer>> getMember() {
        return member;
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