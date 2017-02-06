package com.deity.design.observer;

import java.util.LinkedList;

/**
 * 一个具体的主题实现类
 * Created by Deity on 2017/1/10.
 */

public class SubjectImpl implements ISubject {
    private LinkedList<IObserver> observers = new LinkedList<>();
    /**
     * 新的观察者订阅主题
     *
     * @param observer
     */
    @Override
    public void attach(IObserver observer) {
        observers.add(observer);
    }

    /**
     * 观察者取消订阅主题
     *
     * @param observer
     */
    @Override
    public void remove(IObserver observer) {
        observers.remove(observer);//return true if this list contained the specified element
    }

    /**
     * 新的事件需要 通知 观察者
     *
     * @param somethingNews
     */
    @Override
    public void notify(String somethingNews) {
        for (IObserver observer:observers){
            observer.update(somethingNews);
        }
    }
}
