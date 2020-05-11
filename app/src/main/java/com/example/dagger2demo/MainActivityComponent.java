package com.example.dagger2demo;

import dagger.Component;

/**
 * 桥梁
 */
@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {
    /**
     * 指定使用在哪里
     * */
    void inject(MainActivity demo1MainActivity);
}
