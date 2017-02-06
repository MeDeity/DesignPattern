package com.deity.design;

import com.deity.design.observer.IObserver;
import com.deity.design.observer.ISubject;
import com.deity.design.observer.ObserverImpl;
import com.deity.design.observer.SubjectImpl;
import com.deity.design.template.AbsMatchMaking;
import com.deity.design.template.ReaderAndFengJieImpl;
import com.deity.design.template.XiMenQingAndPanJinLianImpl;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void ObserverTest(){
        /**
         * 测试需要，我们做了以下动作
         * 1.创建一个主题: 今日头条
         * 2.我们这边创建2个观察者
         * 3.观察者订阅 今日头条这个主题
         * 4.今日头条 推送新闻
         */
        ISubject JINRITOUTIAO = new SubjectImpl();
        IObserver littleWhite = new ObserverImpl("小白");
        IObserver BigWhite = new ObserverImpl("大白");
        JINRITOUTIAO.attach(littleWhite);
        JINRITOUTIAO.attach(BigWhite);
        JINRITOUTIAO.notify("2017年到了");
    }

    @Test
    public void templateTest(){
        AbsMatchMaking 王婆 = new XiMenQingAndPanJinLianImpl();
        王婆.matchMaking();
        //小编学习了王婆的经验后，跃跃欲试,毕竟有现成的模板告诉小编 怎么成为一个成功的 媒人，看小编如何撮合读者跟凤姐
        AbsMatchMaking 小编 = new ReaderAndFengJieImpl();
        小编.matchMaking();
    }
}