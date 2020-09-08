package com.example.demo8.mapper;

import com.example.demo8.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    @Select("select * from sys_user;")
    List<User> allUser();
}
