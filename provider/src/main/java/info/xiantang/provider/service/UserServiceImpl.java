package info.xiantang.provider.service;

import info.xiantang.api.bean.User;
import info.xiantang.api.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    public List<User> getUserById(int userId) {
        User xiantang = new User(1, "xiantang");
        User dd = new User(2, "dd");
        List<User> users = new ArrayList<User>();
        users.add(dd);
        users.add(xiantang);
        return users;

    }

    @Override
    public void add(List<User> list) {
        list.forEach((Object user) -> {
            System.out.println(user);
            // fastjson's JSONObject, Not User type
            System.out.println(user.getClass());
        });
    }
}
