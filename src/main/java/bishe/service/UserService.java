package bishe.service;

import bishe.pojo.User;

import java.util.List;

public interface UserService {
    List<User> getUserList();

    public User login(String uName, String pwd);

    User findUserById(String userId);
}
