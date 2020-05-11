package com.example.demo6;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @ProjectName: Dagger2Demo
 * @Package: com.example.demo6
 * @ClassName: AppComponent
 * @Description: java类作用描述
 * @Author: Jeffray
 * @CreateDate: 2020/5/6 13:59
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/5/6 13:59
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    ActivityStackManager getActivityStackManager();
    Application getApplication();
}
