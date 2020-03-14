package info.xiantang.consumer;

import info.xiantang.api.bean.Order;
import info.xiantang.api.bean.User;
import info.xiantang.api.service.OrderService;
import info.xiantang.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    private UserService userService;

    public List<Order> getOrderByUser(User user) {
        return null;
    }

    @Override
    public List<User> find() {
        List<User> userById = userService.getUserById(1);
        return userById;

    }

}
