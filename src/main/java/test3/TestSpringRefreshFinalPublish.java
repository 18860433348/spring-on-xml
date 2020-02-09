package test3;

import mapper.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
*@Author DoubleC
*@Description TODO
*@Date 2020/02/08 14:41
**/
@Component
public class TestSpringRefreshFinalPublish implements ApplicationListener<ContextRefreshedEvent> {

    /**
     * spring刷新结束后会推送结束事件 事件类型为ContextRefreshedEvent 包装了applicationContext
     *所以我们监听这个事件就等于在spring刷新结束后执行特定的方法
     * 并且这个事件中还包装了包装了applicationContext  我们可以获取实例化的类
    */
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        //保证只执行一次 因为spring有两个容器

            ApplicationContext applicationContext = event.getApplicationContext();
            UserMapper userMap = applicationContext.getBean(UserMapper.class);
            System.out.println(111);
            System.out.println(userMap);

    }
}
