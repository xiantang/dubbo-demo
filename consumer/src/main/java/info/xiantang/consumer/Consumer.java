package info.xiantang.consumer;

import info.xiantang.api.bean.User;
import info.xiantang.api.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Consumer {
    public static void main(String[] args) throws InterruptedException {
//        TimeUnit.SECONDS.sleep(10);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        OrderService orderService = (OrderService)context.getBean("orderService"); // 获取远程服务代理
        List<User> users = orderService.find();// 执行远程方法
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            System.out.println(user.getName());
        }

    }
}
