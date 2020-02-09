package test2;

import entity.User;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
*@Author DoubleC
*@Description TODO
*@Date 2020/02/08 12:47
**/
@Component
public class CustomerApplicationListener implements ApplicationListener<CustomerEvent> {

    @Override
    public void onApplicationEvent(CustomerEvent event) {
        User user = event.getUser();
        System.out.println(user.toString());
    }
}
