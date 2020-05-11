package com.example.demo7;

import dagger.Component;

/**
 * 桥梁
 */
@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {
    /**
     * 指定使用在哪里
     * */
    void inject(MainActivity mainActivity);
}
