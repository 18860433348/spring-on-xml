package test2;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.PostConstruct;

/**
*@Author DoubleC
*@Description TODO
*@Date 2020/02/08 12:49
**/
@Component
public class TestPublishEvent{


    /**
     * 这种方式可以让spring一初始化完后就调用被@PostConstruct标记的方法
    */

    @Autowired
    ApplicationEventPublisher applicationEventPublisher;


    @PostConstruct
    public void publishEvent() {
        User user = new User();
        user.setAge(15);
        user.setId(66L);
        user.setName("陈小川");
        CustomerEvent customerEvent = new CustomerEvent(33, user);
        applicationEventPublisher.publishEvent(customerEvent);
    }
}
