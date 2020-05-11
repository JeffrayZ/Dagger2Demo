package com.example.demo5;

import dagger.Component;

/**
 * 桥梁
 * @Scope的作用是使同一个Component中供应的实例保持唯一。
 */
@ActivityScope
@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {
    /**
     * 指定使用在哪里
     * */
    void inject(MainActivity mainActivity);
}
