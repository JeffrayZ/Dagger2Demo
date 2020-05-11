package com.example.demo8;

import com.example.demo8.app.AppComponent;

import dagger.Component;

/**
 * 桥梁
 */
@Component(modules = BeggarModule.class,dependencies = AppComponent.class)
public interface BeggarComponent {
    /**
     * 指定使用在哪里
     * */
    void inject(MainActivity mainActivity);
}
