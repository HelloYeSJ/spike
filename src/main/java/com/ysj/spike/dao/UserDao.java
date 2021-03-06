package com.ysj.spike.dao;

import com.ysj.spike.domain.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserDao {

    @Select("select * from busi_user where id = #{id}")
    User getById(@Param("id") Long id);

    @Insert("insert into busi_user(id,name) values(#{id},#{name})")
    int insert(User user);

    @Update("update busi_user set password = #{password} where id = #{id}")
    void update(User toBeUpdate);
}
