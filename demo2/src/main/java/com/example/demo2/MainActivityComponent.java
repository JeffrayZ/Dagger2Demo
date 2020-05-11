package com.example.demo2;

import dagger.BindsInstance;
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

    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder getUploadView(IUploadView iUploadView);
        MainActivityComponent build();
    }
}
