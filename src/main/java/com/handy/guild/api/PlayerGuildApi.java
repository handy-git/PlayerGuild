package com.handy.guild.api;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

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
        return PlayerGuildApi.SingletonHolder.INSTANCE;
    }

    /**
     * 增加公会资金
     *
     * @param guildName 公会名称
     * @param money     资金
     * @return true/成功
     * @since 1.0.2
     */
    public boolean giveGuildMoneyByName(String guildName, int money) {
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
    public boolean takeGuildMoneyByName(String guildName, int money) {
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
    public boolean setGuildMoneyByName(String guildName, int money) {
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
    public boolean giveGuildProsperityDegreeByName(String guildName, int money) {
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
    public boolean takeGuildProsperityDegreeByName(String guildName, int money) {
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
    public boolean setGuildProsperityDegreeByName(String guildName, int money) {
        return true;
    }

    /**
     * 增加玩家贡献
     *
     * @param playerName 玩家名称
     * @param money      贡献
     * @return true/成功
     * @since 1.0.2
     */
    public boolean givePlayerMoneyByName(String playerName, int money) {
        return true;
    }

    /**
     * 减少玩家贡献
     *
     * @param playerName 玩家名称
     * @param money      贡献
     * @return true/成功
     * @since 1.0.2
     */
    public boolean takePlayerMoneyByName(String playerName, int money) {
        return true;
    }

    /**
     * 设置玩家贡献
     *
     * @param playerName 玩家名称
     * @param money      贡献
     * @return true/成功
     * @since 1.0.2
     */
    public boolean setPlayerMoneyByName(String playerName, int money) {
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
    public boolean givePlayerMoneyByName(Player player, int money) {
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
    public boolean takePlayerMoneyByName(Player player, int money) {
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
    public boolean setPlayerMoneyByName(Player player, int money) {
        return true;
    }

    /**
     * 获取玩家公会名
     *
     * @param player 玩家
     * @return 公会名
     * @since 1.0.2
     */
    public String getPlayerGuildName(Player player) {
        return null;
    }

    /**
     * 获取玩家公会名
     *
     * @param playerName 玩家名
     * @return 公会名
     * @since 1.0.2
     */
    public String getPlayerGuildName(String playerName) {
        return null;
    }

    /**
     * 获取玩家贡献
     *
     * @param player 玩家
     * @return 玩家贡献
     * @since 1.0.2
     */
    public Integer getPlayerMoney(Player player) {
        return 0;
    }

    /**
     * 获取玩家贡献
     *
     * @param playerName 玩家名
     * @return 玩家贡献
     * @since 1.0.2
     */
    public Integer getPlayerMoney(String playerName) {
        return 0;
    }

    /**
     * 获取玩家公会成员
     *
     * @param player 玩家
     * @return 公会玩家名称集合
     * @since 1.2.1
     */
    public List<String> getPlayerGuildMember(Player player) {
        return new ArrayList<String>();
    }

    /**
     * 获取玩家公会成员
     *
     * @param playerName 玩家名
     * @return 公会玩家名称集合
     * @since 1.2.0
     */
    public List<String> getPlayerGuildMember(String playerName) {
        return new ArrayList<String>();
    }

    /**
     * 获取玩家公会职位
     *
     * @param player 玩家
     * @return 公会职位
     * @since 1.2.1
     */
    public String getPlayerGuildRole(Player player) {
        return null;
    }

    /**
     * 获取玩家公会职位
     *
     * @param playerName 玩家名
     * @return 公会职位
     * @since 1.2.1
     */
    public String getPlayerGuildRole(String playerName) {
        return null;
    }

}