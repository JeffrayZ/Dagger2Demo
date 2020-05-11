package com.example.demo3;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;


/**
 * 供应者
 * */
@Module
public class MainActivityModule {
    IUploadView iUploadView;
    public MainActivityModule(IUploadView iview) {
        iUploadView = iview;
    }

    @Provides
    IUploadView getView(){
        return iUploadView;
    }

    @Named("has params")
    @Provides
    UploadPresenter withParams(IUploadView iview){
        return new UploadPresenter(iview);
    }

    @Named("no params")
    @Provides
    UploadPresenter noParams(){
        return new UploadPresenter();
    }
}

// @Named("no params") 很麻烦，需要自己写里面的参数，界面中对应的也要写，有简便方式吗？请看Demo4