package info.xiantang.provider.service;

import info.xiantang.api.bean.User;
import info.xiantang.api.service.UserService;
import org.apache.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

@Service(dynamic = true)
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
    public void add(Map<Integer, User> list) {
        for (Map.Entry<Integer, User> next : list.entrySet()) {
            User value = next.getValue();
            System.out.println(value);

        }
    }


}
