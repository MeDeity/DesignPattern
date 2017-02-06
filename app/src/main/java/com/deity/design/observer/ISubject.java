package com.deity.design.observer;

/**
 * 主题接口(也可以做成抽象类),这样有多个主题的时候,可以继承或实现该接口（抽象类）
 * 主题一般有 订阅、取消订阅、通知 等基本功能
 * Created by Deity on 2017/1/10.
 */

public interface ISubject {
    /**新的观察者订阅主题*/
    void attach(IObserver observer);
    /**观察者取消订阅主题*/
    void remove(IObserver observer);
    /**新的事件需要 通知 观察者*/
    void notify(String somethingNews);
}
