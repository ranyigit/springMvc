package com.tv189;

import com.rory.services.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {
    @Test
    public void findAllTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springConfig.xml");

        IUserService userService = applicationContext.getBean(IUserService.class);

        userService.findAll();
    }
}
