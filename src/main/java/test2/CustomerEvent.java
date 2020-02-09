package test2;

import entity.User;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

import java.awt.*;

/**
*@Author DoubleC
*@Description TODO
*@Date 2020/02/08 12:40
**/
public class CustomerEvent extends ApplicationEvent {

    private User user;

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public CustomerEvent(Object source, User user) {
        super(source);
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
