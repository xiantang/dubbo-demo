package info.xiantang.consumer;

import info.xiantang.api.bean.User;
import info.xiantang.api.service.OrderService;
import info.xiantang.api.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Consumer {
    public static void main(String[] args) throws Exception {
//        TimeUnit.SECONDS.sleep(10);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        UserService userService = (UserService) context.getBean("userService");
        List<User> list = new ArrayList<>();
        list.add(new User(1, "Helen"));
        list.add(new User(2, "Cindy"));
        userService.add(list);
        System.out.println("ok");

    }
}
