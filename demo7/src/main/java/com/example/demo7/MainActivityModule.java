package com.example.demo7;

import dagger.Module;
import dagger.Provides;


/**
 * 供应者
 */
@Module
class MainActivityModule {
    @Provides
    UploadPresenter uploadPresenter() {
        return new UploadPresenter();
    }
}
