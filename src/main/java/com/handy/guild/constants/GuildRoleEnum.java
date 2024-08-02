package com.handy.guild.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * 公会角色
 *
 * @author handy
 */
@AllArgsConstructor
public enum GuildRoleEnum {
    /**
     * 类型
     */
    ONE(1, "role.one"),
    TWO(2, "role.two"),
    THREE(3, "role.three"),
    FOUR(4, "role.four");

    @Getter
    private final Integer roleId;
    private final String roleName;

    /**
     * 获取角色
     *
     * @param roleId 角色id
     * @return GuildRoleEnum
     */
    public static GuildRoleEnum getEnumThrow(Integer roleId) {
        if (roleId < 1) {
            roleId = 1;
        }
        if (roleId > 4) {
            roleId = 4;
        }
        for (GuildRoleEnum guildRoleEnum : GuildRoleEnum.values()) {
            if (guildRoleEnum.roleId.equals(roleId)) {
                return guildRoleEnum;
            }
        }
        throw new RuntimeException("错误的公会角色!!");
    }

    /**
     * 获取角色名称
     *
     * @param roleId 角色id
     * @return 角色名称
     * @since 1.10.1
     */
    public static String getRoleName(Integer roleId) {
        return getRoleName(getEnumThrow(roleId));
    }

    /**
     * 获取角色名称
     *
     * @param guildRoleEnum 角色枚举
     * @return 角色名称
     * @since 1.10.1
     */
    public static String getRoleName(GuildRoleEnum guildRoleEnum) {
        return null;
    }

    /**
     * 获取类型
     *
     * @return 类型
     * @since 1.12.4
     */
    public static List<String> getEnum() {
        List<String> typeList = new ArrayList<>();
        for (GuildRoleEnum guildRoleEnum : GuildRoleEnum.values()) {
            typeList.add(guildRoleEnum.getRoleId().toString());
        }
        return typeList;
    }

}