package com.example.demo5;

import dagger.Module;
import dagger.Provides;


/**
 * 供应者
 * @Scope的作用是使同一个Component中供应的实例保持唯一。
 * */
@Module
public class MainActivityModule {

    @ActivityScope
    @Provides
    UploadPresenter noParams(){
        return new UploadPresenter();
    }
}