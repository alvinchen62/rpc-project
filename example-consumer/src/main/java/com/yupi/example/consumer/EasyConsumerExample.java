package com.yupi.example.consumer;

import com.yupi.example.common.model.User;
import com.yupi.example.common.service.UserService;
import com.yupi.yurpc.proxy.ServiceProxyFactory;

/**
 * 简易服务消费者示例
 */
public class EasyConsumerExample {

    public static void main(String[] args) {

        // 动态代理
        UserService userServiceDynamic = ServiceProxyFactory.getProxy(UserService.class);

        // 静态代理
        UserService userService = new UserServiceProxy();
        User user = new User();
        user.setName("yupi_testing_666");
        // 调用
        User newUser = userServiceDynamic.getUser(user);
        if (newUser != null) {
            System.out.println(newUser.getName());
        } else {
            System.out.println("user == null");
        }
    }

}
