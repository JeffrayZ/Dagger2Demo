package com.example.demo9;

import dagger.Component;
import dagger.Subcomponent;

/**
 * 桥梁
 */
@Subcomponent(modules = BeggarModule.class)
public interface BeggarComponent { // 乞丐举牌说谁给食物和住宿就可以到谁府上务工
    /**
     * 指定使用在哪里
     * */
    void inject(MainActivity mainActivity);
}
