package com.deity.design.decorator;

/**
 * 神秘人
 * Created by Deity on 2017/2/13.
 */

public class MysteryMan implements IMan{

    /**
     * 帅哥总是和身价挂钩的
     */
    @Override
    public long worth() {
        return 10000L;//初始资金
    }

    /**
     * 描述
     */
    @Override
    public String description() {
        return "的帅哥";
    }
}
