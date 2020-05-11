package com.example.demo4;

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

    @HasParams
    @Provides
    UploadPresenter withParams(IUploadView iview){
        return new UploadPresenter(iview);
    }

    @NoParams
    @Provides
    UploadPresenter noParams(){
        return new UploadPresenter();
    }
}