package info.xiantang.api.service;

import info.xiantang.api.bean.Order;
import info.xiantang.api.bean.User;

import java.util.List;

public interface OrderService {

    List<Order> getOrderByUser(User user);

    List<User> find();
}
