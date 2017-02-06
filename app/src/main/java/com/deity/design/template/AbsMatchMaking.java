package com.deity.design.template;

/**
 * 说媒经验模板，作者 王婆，假冒伪劣 必究法律责任
 * Created by Deity on 2017/1/12.
 */

public abstract class AbsMatchMaking {
    /**调查双方喜好*/
    public abstract void research();
    /**邀约双方会面*/
    public abstract void invitation();
    /**给男女双方互讲优点，让男女双方互有好感*/
    public abstract void advantage();
    /**获取报酬*/
    public abstract void obatinMoney();

    public void matchMaking(){
        research();
        invitation();
        advantage();
        obatinMoney();
    }
}
