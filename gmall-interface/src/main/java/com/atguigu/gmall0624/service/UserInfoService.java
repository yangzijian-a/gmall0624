package com.atguigu.gmall0624.service;

import com.atguigu.gmall0624.bean.UserAddress;
import com.atguigu.gmall0624.bean.UserInfo;

import java.util.List;

public interface UserInfoService {

    /**
     * 返回所有数据
     * @return
     */
    List<UserInfo> findAll();

    //想根据用户Id,或者用户的昵称或者根据用户的名称等多个不同的字段进行查询，如果什么都不输入，则查询所有
    List<UserInfo> findUserInfo(UserInfo userInfo);

    //模糊查询nickname
    List<UserInfo> findByNickName(String nickName);

    //添加数据
    void addUser(UserInfo userInfo);

    /**
     * 修改数据
     * @param userInfo
     */
    void updUser(UserInfo userInfo);

    /**
     * 删除数据
     * @param userInfo
     */
    void delUser(UserInfo userInfo);

    /**
     * 根据用户id查找用户收货地址列表
     * @param userId
     * @return
     */
    List<UserAddress> findUserAddressListByUserId(String userId);

    /**
     * 根据用户id查找用户收货地址列表
     * @param userId
     * @return
     */
    List<UserAddress> findUserAddressListByUserId(UserAddress userAddress);
}
