package com.deity.design;

import com.deity.design.annotation.Daughter;
import com.deity.design.annotation.HumanAnnotation;
import com.deity.design.decorator.BuildMan;
import com.deity.design.decorator.IMan;
import com.deity.design.decorator.LuxuryCarMan;
import com.deity.design.decorator.MysteryMan;
import com.deity.design.observer.IObserver;
import com.deity.design.observer.ISubject;
import com.deity.design.observer.ObserverImpl;
import com.deity.design.observer.SubjectImpl;
import com.deity.design.template.AbsMatchMaking;
import com.deity.design.template.ReaderAndFengJieImpl;
import com.deity.design.template.XiMenQingAndPanJinLianImpl;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * 测试用例
 */
public class ExampleUnitTest {
    /**观察者Demo*/
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

    /**模板模式Demo*/
    @Test
    public void templateTest(){
        AbsMatchMaking 王婆 = new XiMenQingAndPanJinLianImpl();
        王婆.matchMaking();
        //小编学习了王婆的经验后，跃跃欲试,毕竟有现成的模板告诉小编 怎么成为一个成功的 媒人，看小编如何撮合读者跟凤姐
        AbsMatchMaking 小编 = new ReaderAndFengJieImpl();
        小编.matchMaking();
    }
    /**建造者模式*/

    /**自定义注解Demo*/
    @Test
    public void AnnotationTest(){
        Daughter daughter = new Daughter();
        Method[] fields = Daughter.class.getDeclaredMethods();
        for (Method field:fields){
            if (field.isAnnotationPresent(HumanAnnotation.class)) {
                HumanAnnotation humanAnnotation = field.getAnnotation(HumanAnnotation.class);
                daughter.setAge(humanAnnotation.getMyAge());
                daughter.setBirthday(humanAnnotation.getMyBrithday());
                daughter.setUserName(humanAnnotation.userName());
            }
        }
        System.out.println(daughter.toString());
    }

    /**装饰者模式*/
    @Test
    public void DecoratorTest(){
        IMan reader = new BuildMan(new LuxuryCarMan(new MysteryMan()));
        System.out.println("据FBI透露,神秘的读者是一个"+reader.description()+"据悉身价已达$"+reader.worth());
    }
}