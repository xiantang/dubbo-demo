package info.xiantang.consumer;

import info.xiantang.api.bean.User;
import info.xiantang.api.service.OrderService;
import info.xiantang.api.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Consumer {
    public static void main(String[] args) throws Exception {
//        TimeUnit.SECONDS.sleep(10);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        UserService userService = (UserService) context.getBean("userService");
        Map<Integer,User> list = new HashMap<>();
        list.put(1,new User(1, "Helen"));
        list.put(2,new User(2, "Cindy"));
        userService.add(list);
        System.out.println("ok");

    }
}
