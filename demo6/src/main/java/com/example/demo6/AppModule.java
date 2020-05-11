package com.example.demo6;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * 使用了Dagger2默认提供的作用域注解@Singleton，通过源码可以发现它的实现其实和前面的@ActivityScope是一样的
 * 但由于它的字面意思为单例，所以我们通常把它应用在全局性的桥梁和实例供应端中。
 */
@Module
public class AppModule {
    private Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Singleton
    @Provides
    Application getApplication(){
        return application;
    }

    @Singleton
    @Provides
    ActivityStackManager getActivityStackManager(){
        return new ActivityStackManager();
    }
}
