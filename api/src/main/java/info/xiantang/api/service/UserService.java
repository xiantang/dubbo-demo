package info.xiantang.api.service;


import info.xiantang.api.bean.User;

import java.util.List;

public interface UserService {

    List<User> getUserById(int userId);

    void add(List<User> list) throws Exception;
}
