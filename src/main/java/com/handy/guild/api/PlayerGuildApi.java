package com.handy.guild.api;

import com.handy.guild.constants.GuildRoleEnum;
import com.handy.guild.enter.GuildInfo;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * API
 *
 * @author handy
 * @since 1.0.2
 */
public class PlayerGuildApi {
    private PlayerGuildApi() {
    }

    private static class SingletonHolder {
        private static final PlayerGuildApi INSTANCE = new PlayerGuildApi();
    }

    public static PlayerGuildApi getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * 增加公会资金
     *
     * @param guildName 公会名称
     * @param money     资金
     * @return true/成功
     * @since 1.0.2
     */
    public boolean giveGuildMoneyByName(@NotNull String guildName, int money) {
        return true;
    }

    /**
     * 减少公会资金
     *
     * @param guildName 公会名称
     * @param money     资金
     * @return true/成功
     * @since 1.0.2
     */
    public boolean takeGuildMoneyByName(@NotNull String guildName, int money) {
        return true;
    }

    /**
     * 设置公会资金
     *
     * @param guildName 公会名称
     * @param money     资金
     * @return true/成功
     * @since 1.0.2
     */
    public boolean setGuildMoneyByName(@NotNull String guildName, int money) {
        return true;
    }

    /**
     * 增加公会活跃
     *
     * @param guildName 公会名称
     * @param money     活跃
     * @return true/成功
     * @since 1.0.2
     */
    public boolean giveGuildProsperityDegreeByName(@NotNull String guildName, int money) {
        return true;
    }

    /**
     * 减少公会活跃
     *
     * @param guildName 公会名称
     * @param money     活跃
     * @return true/成功
     * @since 1.0.2
     */
    public boolean takeGuildProsperityDegreeByName(@NotNull String guildName, int money) {
        return true;
    }

    /**
     * 设置公会活跃
     *
     * @param guildName 公会名称
     * @param money     活跃
     * @return true/成功
     * @since 1.0.2
     */
    public boolean setGuildProsperityDegreeByName(@NotNull String guildName, int money) {
        return true;
    }


    /**
     * 增加公会矿石
     *
     * @param guildName 公会名称
     * @param money     活跃
     * @return true/成功
     * @since 1.11.3
     */
    public boolean giveGuildOreByName(@NotNull String guildName, int money) {
        return true;
    }

    /**
     * 减少公会矿石
     *
     * @param guildName 公会名称
     * @param money     活跃
     * @return true/成功
     * @since 1.11.3
     */
    public boolean takeGuildOreByName(@NotNull String guildName, int money) {
        return true;
    }

    /**
     * 设置公会矿石
     *
     * @param guildName 公会名称
     * @param money     活跃
     * @return true/成功
     * @since 1.11.3
     */
    public boolean setGuildOreByName(@NotNull String guildName, int money) {
        return true;
    }

    /**
     * 增加玩家贡献
     *
     * @param playerName 玩家名称
     * @param money      贡献
     * @return true/成功
     * @since 1.0.2
     * @deprecated 请使用 {@link #givePlayerMoneyByName(Player, int)} 方法。
     */
    @Deprecated
    public boolean givePlayerMoneyByName(@NotNull String playerName, int money) {
        return true;
    }

    /**
     * 减少玩家贡献
     *
     * @param playerName 玩家名称
     * @param money      贡献
     * @return true/成功
     * @since 1.0.2
     * @deprecated 请使用 {@link #takePlayerMoneyByName(Player, int)} 方法。
     */
    @Deprecated
    public boolean takePlayerMoneyByName(@NotNull String playerName, int money) {
        return true;
    }

    /**
     * 设置玩家贡献
     *
     * @param playerName 玩家名称
     * @param money      贡献
     * @return true/成功
     * @since 1.0.2
     * @deprecated 请使用 {@link #setPlayerMoneyByName(Player, int)} 方法。
     */
    @Deprecated
    public boolean setPlayerMoneyByName(@NotNull String playerName, int money) {
        return true;
    }

    /**
     * 增加玩家贡献
     *
     * @param player 玩家
     * @param money  贡献
     * @return true/成功
     * @since 1.0.2
     */
    public boolean givePlayerMoneyByName(@NotNull Player player, int money) {
        return true;
    }

    /**
     * 减少玩家贡献
     *
     * @param player 玩家
     * @param money  贡献
     * @return true/成功
     * @since 1.0.2
     */
    public boolean takePlayerMoneyByName(@NotNull Player player, int money) {
        return true;
    }

    /**
     * 设置玩家贡献
     *
     * @param player 玩家
     * @param money  贡献
     * @return true/成功
     * @since 1.0.2
     */
    public boolean setPlayerMoneyByName(@NotNull Player player, int money) {
        return true;
    }

    /**
     * 获取玩家公会名
     *
     * @param player 玩家
     * @return 公会名
     * @since 1.0.2
     */
    public String getPlayerGuildName(@NotNull Player player) {
        return null;
    }

    /**
     * 获取玩家公会名
     *
     * @param playerName 玩家名
     * @return 公会名
     * @since 1.0.2
     * @deprecated 请使用 {@link #getPlayerGuildName(Player)} 方法。
     */
    @Deprecated
    public String getPlayerGuildName(@NotNull String playerName) {
        return null;
    }

    /**
     * 获取玩家贡献
     *
     * @param player 玩家
     * @return 玩家贡献
     * @since 1.0.2
     */
    public Integer getPlayerMoney(@NotNull Player player) {
        return 0;
    }

    /**
     * 获取玩家贡献
     *
     * @param playerName 玩家名
     * @return 玩家贡献
     * @since 1.0.2
     * @deprecated 请使用 {@link #getPlayerMoney(Player)} 方法。
     */
    @Deprecated
    public Integer getPlayerMoney(@NotNull String playerName) {
        return 0;
    }

    /**
     * 获取玩家捐赠贡献
     *
     * @param player 玩家
     * @return 玩家捐赠贡献
     * @since 1.7.4
     */
    public Integer getPlayerGuildMoney(@NotNull Player player) {
        return 0;
    }

    /**
     * 获取玩家贡献资金
     *
     * @param playerName 玩家名
     * @return 玩家捐贡献资金
     * @since 1.7.4
     * @deprecated 请使用 {@link #getPlayerGuildMoney(Player)} 方法。
     */
    @Deprecated
    public Integer getPlayerGuildMoney(@NotNull String playerName) {
        return 0;
    }

    /**
     * 获取玩家公会成员
     *
     * @param player 玩家
     * @return 公会玩家名称集合
     * @since 1.2.1
     */
    public List<String> getPlayerGuildMember(@NotNull Player player) {
        return new ArrayList<>();
    }

    /**
     * 获取玩家公会成员
     *
     * @param playerName 玩家名
     * @return 公会玩家名称集合
     * @since 1.2.0
     * @deprecated 请使用 {@link #getPlayerGuildMember(Player)} 方法。
     */
    @Deprecated
    public List<String> getPlayerGuildMember(@NotNull String playerName) {
        return new ArrayList<>();
    }

    /**
     * 获取玩家公会职位
     *
     * @param player 玩家
     * @return 公会职位
     * @since 1.2.1
     */
    public String getPlayerGuildRole(@NotNull Player player) {
        return null;
    }

    /**
     * 获取玩家公会职位
     *
     * @param playerName 玩家名
     * @return 公会职位
     * @since 1.2.1
     * @deprecated 请使用 {@link #getPlayerGuildRole(Player)} 方法。
     */
    @Deprecated
    public String getPlayerGuildRole(@NotNull String playerName) {
        return null;
    }

    /**
     * 获取玩家公会职位Enum
     *
     * @param player 玩家
     * @return 公会角色
     * @since 1.13.6
     */
    public GuildRoleEnum getPlayerGuildRoleEnum(@NotNull Player player) {
        return null;
    }

    /**
     * 获取玩家公会战击杀次数
     *
     * @param player 玩家
     * @return 玩家公会战击杀次数
     * @since 1.4.6
     */
    public Integer getPlayerKill(@NotNull Player player) {
        return 0;
    }

    /**
     * 获取玩家公会战击杀次数
     *
     * @param playerName 玩家名
     * @return 家公会战击杀次数
     * @since 1.4.6
     * @deprecated 请使用 {@link #getPlayerKill(Player)} 方法。
     */
    @Deprecated
    public Integer getPlayerKill(@NotNull String playerName) {
        return 0;
    }

    /**
     * 获取玩家公会战死亡次数
     *
     * @param player 玩家
     * @return 玩家公会战死亡次数
     * @since 1.4.6
     */
    public Integer getPlayerDie(@NotNull Player player) {
        return 0;
    }

    /**
     * 获取玩家公会战死亡次数
     *
     * @param playerName 玩家名
     * @return 玩家公会战
     * @since 1.4.6
     * @deprecated 请使用 {@link #getPlayerDie(Player)} 方法。
     */
    @Deprecated
    public Integer getPlayerDie(@NotNull String playerName) {
        return 0;
    }

    /**
     * 判断是否正在进行pvp
     *
     * @param player 玩家
     * @return true pvp中
     * @since 1.5.4
     */
    public boolean isPvp(@NotNull Player player) {
        return false;
    }

    /**
     * 关闭玩家pvp检查
     *
     * @param player 玩家
     * @since 1.5.9
     */
    public void closePvp(@NotNull Player player) {

    }

    /**
     * 开启玩家pvp检查
     *
     * @param player 玩家
     * @since 1.5.9
     */
    public void openPvp(@NotNull Player player) {
    }

    /**
     * 根据公会id获取正在进行匹配比赛的玩家
     *
     * @param guildId 公会id
     * @return 玩家uuid集合
     * @since 1.6.2
     */
    public List<UUID> getMatchStartPlayer(@NotNull Integer guildId) {
        return new ArrayList<>();
    }

    /**
     * 根据公会id获取正在进行赛季比赛的玩家
     *
     * @param guildId 公会id
     * @return 玩家uuid集合
     * @since 1.6.2
     */
    public List<UUID> getSeasonStartPlayer(@NotNull Integer guildId) {
        return new ArrayList<>();
    }

    /**
     * 获取全部公会名称
     *
     * @return 公会名称集合
     * @since 1.10.0
     */
    public List<String> getAllGuildName() {
        return new ArrayList<>();
    }

    /**
     * 获取全部公会信息
     *
     * @return 公会信息集合
     * @since 1.13.9
     */
    public List<GuildInfo> getAllGuild() {
        return new ArrayList<>();
    }

    /**
     * 根据公会名称获取全部公会成员名称
     *
     * @param guildName 公会名
     * @return 公会成员
     * @since 1.10.0
     */
    public List<String> getGuildPlayer(@NotNull String guildName) {
        return new ArrayList<>();
    }

}