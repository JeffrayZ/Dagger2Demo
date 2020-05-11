package com.example.dagger2demo;

import dagger.Module;
import dagger.Provides;


/**
 * 供应者
 * */
@Module
class MainActivityModule {
    // 也可以通过Component传入，请看Demo2
    IUploadView iUploadView;
    public MainActivityModule(IUploadView iview) {
        iUploadView = iview;
    }

    @Provides
    IUploadView iUploadView(){
        return iUploadView;
    }

    @Provides
    UploadPresenter uploadPresenter(IUploadView iview){
        return new UploadPresenter(iview);
    }

    // =================================================无参构造方法分割线==============================================

//    Cannot have more than one @Provides method with the same name in a single module
    // 怎么处理这个问题？请看Demo3
//    @Provides
//    UploadPresenter uploadPresenter(){
//        return new UploadPresenter();
//    }

    // =================================================无参构造方法分割线==============================================
}
