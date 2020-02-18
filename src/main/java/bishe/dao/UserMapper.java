package bishe.dao;

import bishe.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/* @Mapper注解是Mybatis框架用的，标记为映射器
@Repository注解是Spring框架用的，标记为一个Bean*/
@Mapper
@Repository
public interface UserMapper {
   List<User> getUserList();
   public User login(@Param("username") String username,
                     @Param("password") String password);

    User findUserById(String userId);
}
