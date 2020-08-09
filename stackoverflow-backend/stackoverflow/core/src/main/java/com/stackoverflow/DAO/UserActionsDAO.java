package com.stackoverflow.DAO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserActionsDAO {

    Integer getUserCnt();

//    List<User> getAllUsers();

}
