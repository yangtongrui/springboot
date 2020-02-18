package bishe.service;

import bishe.dao.UserMapper;
import bishe.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public User login(String name, String pwd) {
        return userMapper.login(name,pwd);
    }

    @Override
    public User findUserById(String userId) {
        return userMapper.findUserById(userId);
    }
}
