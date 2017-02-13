package com.deity.design.decorator;

/**
 * 拥有房产
 * Created by Deity on 2017/2/13.
 */

public class BuildMan implements ISuperMan{
    private IMan man;

    public BuildMan(IMan man){
        this.man = man;
    }
    /**
     * 帅哥总是和身价挂钩的
     */
    @Override
    public long worth() {
        return 5000000+man.worth();//厦门岛内500万房产一套
    }

    /**
     * 描述
     */
    @Override
    public String description() {
        return "拥有厦门岛内500万房产一套，"+man.description();
    }
}
