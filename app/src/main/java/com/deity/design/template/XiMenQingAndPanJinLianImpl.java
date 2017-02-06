package com.deity.design.template;

/**
 * 王婆 亲自出马 撮合 西门庆与潘金莲
 * Created by Deity on 2017/1/12.
 */

public class XiMenQingAndPanJinLianImpl extends AbsMatchMaking {
    /**
     * 调查双方喜好
     */
    @Override
    public void research() {
        System.out.println("西门庆喜欢 漂亮、36D的美女、潘金莲 喜欢有权势的男人[情报Get]");
    }

    /**
     * 邀约双方会面
     */
    @Override
    public void invitation() {
        System.out.println("王婆:西门庆大官人来 我王婆家看个漂亮、36D的美女呗,西门庆:好呀！如入我法眼，给你冲个企鹅VIP");
        System.out.println("王婆:潘，来我家做寿衣吧，做寿衣的官人是个有权有势的大户人家,潘金莲:好呀!");
    }

    /**
     * 给男女双方互讲优点，让男女双方互有好感
     */
    @Override
    public void advantage() {
        System.out.println("王婆:@#$@#$$#^$%&^%*&%^*%^&%^&% 潘金莲:我对这个物品的满意度100% 西门庆:我的大刀早已饥渴难耐");
    }

    /**
     * 获取报酬
     */
    @Override
    public void obatinMoney() {
        System.out.println("恭喜你！获得一项成就,赠送价值288元的QQ游戏礼包,王婆:我去....");
    }
}
