package com.bohai.adviser.persistence.dztg;

import java.util.List;

import com.bohai.adviser.entity.dztg.SysUsersPermissions;

public interface SysUsersPermissionsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DZTG.SYS_USERS_PERMISSIONS
     *
     * @mbggenerated Wed Aug 09 10:51:07 CST 2017
     */
    int insert(SysUsersPermissions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DZTG.SYS_USERS_PERMISSIONS
     *
     * @mbggenerated Wed Aug 09 10:51:07 CST 2017
     */
    int insertSelective(SysUsersPermissions record);
    
    /**
     * 根据用户名查询用户信息
     * @param userName
     * @return
     */
    List<SysUsersPermissions> selectByUserName(String userName);
}