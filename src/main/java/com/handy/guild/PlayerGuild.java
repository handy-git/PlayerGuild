package com.handy.guild;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * 主类
 *
 * @author handy
 */
public class PlayerGuild extends JavaPlugin {
    private static PlayerGuild INSTANCE;

    @Override
    public void onEnable() {
        INSTANCE = this;
    }

    public static PlayerGuild getInstance() {
        return INSTANCE;
    }

}