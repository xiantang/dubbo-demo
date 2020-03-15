package info.xiantang.api.service;


import info.xiantang.api.bean.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<User> getUserById(int userId);

    void add(Map<Integer,User> list) throws Exception;
}
