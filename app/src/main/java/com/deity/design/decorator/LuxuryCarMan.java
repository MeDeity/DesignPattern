package com.deity.design.decorator;

/**
 * 拥有一辆劳斯拉斯豪车
 * Created by Deity on 2017/2/13.
 */

public class LuxuryCarMan implements ISuperMan {
    private IMan man;

    public LuxuryCarMan(IMan man){
        this.man = man;
    }

    /**
     * 帅哥总是和身价挂钩的
     */
    @Override
    public long worth() {
        return 14880000+man.worth();//拥有一辆价值1488万的幻影劳斯莱斯
    }

    /**
     * 描述
     */
    @Override
    public String description() {
        return "拥有一辆价值1488万的幻影劳斯莱斯,"+man.description();
    }
}
