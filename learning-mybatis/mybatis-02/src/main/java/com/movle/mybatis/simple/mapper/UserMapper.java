package com.movle.mybatis.simple.mapper;

import com.movle.mybatis.simple.domain.SysRole;
import com.movle.mybatis.simple.domain.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    SysUser selectById(Long id);

    List<SysUser> selectAll();

    List<SysRole> selectRolesByUserId(Long userId);

    int insertInto(SysUser sysUser);

    int insertInto2(SysUser sysUser);

    int insertInto3(SysUser sysUser);

    int updateById(SysUser sysUser);

    int deleteById(Long id);

    List<SysRole> selectRolesBuUserIdAndRoleAbled(@Param("userId")Long userId,@Param("enabled")Integer enabled);

    /**
     * 动态sql-if-根据动态条件查询用户信息
     * @param sysUser
     * @return
     */
    List<SysUser> selectByUser(SysUser sysUser);

    /**
     * 动态sql-if-根据主键进行更新
     * @param sysUser
     * @return
     */
    int updateByIdSelective(SysUser sysUser);

    /**
     * 动态sql-if-insert的动态sql插入
     * @param sysUser
     * @return
     */
    int insertInto4(SysUser sysUser);

    /**
     * 动态sql-choose-根据用户id或用户名查询
     * @param sysUser
     * @return
     */
    SysUser selectByIdOrUserName(SysUser sysUser);

    /**
     * 动态sql-where-使用where标签根据动态条件查询用户信息
     * @param sysUser
     * @return
     */
    List<SysUser> selectByUser2(SysUser sysUser);

    /**
     * 动态sql-set-根据主键进行更新
     * @param sysUser
     * @return
     */
    int updateByIdSelective2(SysUser sysUser);

    /**
     * 动态sql-foreach实现in集合-根据用户id集合查询
     * @param idList
     * @return
     */
    List<SysUser> selectByIdList(List<Long> idList);

    /**
     * 动态sql-foreach实现批量插入-批量插入用户信息
     */
    int insertList(List<SysUser> userList);

    /**
     * 动态sql-foreach实现动态update-通过Map更新列
     * @param map
     * @return
     */
    int updateByMap(Map<String,Object> map);
}
