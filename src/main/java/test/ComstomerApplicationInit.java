package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
*@Author DoubleC
*@Description TODO
*@Date 2020/02/07 15:15
**/
public class ComstomerApplicationInit implements ApplicationContextInitializer {

    /**
    * spring在调用刷新前执行的自定义操作里面会调用initialize方法
    */
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {

        /**
         * spring校验必要属性的扩展点  可结合ApplicationContextInitializer扩展点使用
         * 把必要参数的key值加入到集合中
        */
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        environment.setRequiredProperties("JAVA_HOME");

        CustomerBeanFactoryPostProcessor customerBeanFactoryPostProcessor = new CustomerBeanFactoryPostProcessor();
        applicationContext.addBeanFactoryPostProcessor(customerBeanFactoryPostProcessor);
        //...自定义操作
        System.out.println("xixixixixixi");
    }
}
