package test4;

import entity.User;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
*@Author DoubleC
*@Description TODO
*@Date 2020/02/09 15:58
**/
@Component
public class UserFactoryBean implements FactoryBean<User>{

    /**
     * 首先第一眼要注意，是FactoryBean接口而不是BeanFactory接口。一般情况下，
     * Spring通过反射机制利用bean的class属性指定实现类来实例化bean ，实例化bean过程比较复杂。
     * FactoryBean接口就是为了简化此过程，把bean的实例化定制逻辑下发给使用者。
    */

    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setName("陈小川");
        user.setAge(26);
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

}
