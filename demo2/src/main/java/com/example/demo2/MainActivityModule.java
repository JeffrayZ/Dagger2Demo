package com.example.demo2;

import dagger.Module;
import dagger.Provides;


/**
 * 供应者
 * */
@Module
public class MainActivityModule {
    @Provides
    UploadPresenter uploadPresenter(IUploadView iview){
        return new UploadPresenter(iview);
    }
}
