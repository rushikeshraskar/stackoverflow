package com.stackoverflow.DAO;

import com.stackoverflow.models.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserActionsDAO {

    Integer getUserCnt();

    List<User> getAllUsers();

}
