package com.deity.design.observer;

/**
 * 观察者接口，也可以做成抽象的，如果有众多的观察者则可以implement或者extend该接口或抽象类
 * Created by Deity on 2017/1/10.
 */

public interface IObserver {

    /**
     * 当主题发生新的变动时,可调用该方法通知观察者更新信息
     * @param somethingNews 从主题接收到的更新信息
     */
    void update(String somethingNews);
}
