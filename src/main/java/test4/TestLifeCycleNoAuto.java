package test4;

import org.springframework.context.Lifecycle;

/**
*@Author DoubleC
*@Description TODO
*@Date 2020/02/09 20:03
**/
public class TestLifeCycleNoAuto implements Lifecycle {

    @Override
    public void start() {
        System.out.println("不自动的生命周期开始运行=======》");
    }

    @Override
    public void stop() {

    }

    @Override
    public boolean isRunning() {
        return false;
    }
}
