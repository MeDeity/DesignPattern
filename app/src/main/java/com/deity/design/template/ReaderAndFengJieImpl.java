package com.deity.design.template;

/**
 * 小编根据王婆的经验尝试撮合 读者与凤姐
 * Created by Deity on 2017/1/12.
 */

public class ReaderAndFengJieImpl extends AbsMatchMaking {
    /**
     * 调查双方喜好
     */
    @Override
    public void research() {
        System.out.println("凤姐:必须为北京大学或清华大学硕士毕业生。必须本科硕士连读，中途无跳级，不留级，不转校。在外参加工作后再回校读书者免等");
        System.out.println("读者:我想结婚，喜欢女的");
    }

    /**
     * 邀约双方会面
     */
    @Override
    public void invitation() {
        System.out.println("小编对凤姐说: 读者是哈佛硕士");
        System.out.println("小编对读者说: 凤姐是女的");
    }

    /**
     * 给男女双方互讲优点，让男女双方互有好感
     */
    @Override
    public void advantage() {
        System.out.println("小编对凤姐说: 有人符合你的要求");
        System.out.println("小编对读者说: 有个女的");
    }

    /**
     * 获取报酬
     */
    @Override
    public void obatinMoney() {
        System.out.println("获得成就,被读者感恩戴德,获得100金");
    }
}
