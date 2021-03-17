package com.movle.mybatis.simple.mapper;

import com.movle.mybatis.simple.domain.SysRole;
import com.movle.mybatis.simple.domain.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

}
