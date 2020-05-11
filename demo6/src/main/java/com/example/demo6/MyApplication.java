package com.example.demo6;

import android.app.Application;

/**
 * @ProjectName: Dagger2Demo
 * @Package: com.example.demo6
 * @ClassName: MyApplication
 * @Description: java类作用描述
 * @Author: Jeffray
 * @CreateDate: 2020/5/6 14:03
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/5/6 14:03
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MyApplication extends Application {
    public static AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }
}
