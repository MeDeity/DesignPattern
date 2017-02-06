package com.deity.design.observer;

/**
 * 观察者实现类
 * Created by Deity on 2017/1/10.
 */

public class ObserverImpl implements IObserver{
    private String mName;

    public ObserverImpl(String mName){
        this.mName = mName;
    }
    /**
     * 当主题发生新的变动时,可调用该方法通知观察者更新信息
     *
     * @param somethingNews 从主题接收到的更新信息
     */
    @Override
    public void update(String somethingNews) {
        System.out.println(mName+":obtain News>>>>>>>>>"+somethingNews);
    }
}
