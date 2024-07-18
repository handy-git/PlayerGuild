package com.handy.guild.enter;

import lombok.Data;

import java.io.Serializable;

/**
 * 公会信息
 *
 * @author handy
 */
@Data
public class GuildInfo implements Serializable {

    /**
     * ID
     */
    private Integer id;

    /**
     * 公会名称
     */
    private String guildName;

    /**
     * 公会等级
     */
    private Integer level;

}