package com.example.demo10.dagger;

import com.example.demo10.MainActivity;

import dagger.Component;

/**
 * @ProjectName: Dagger2Demo
 * @Package: com.example.demo10.dagger
 * @ClassName: MainComponent
 * @Description: java类作用描述
 * @Author: Jeffray
 * @CreateDate: 2020/5/7 10:58
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/5/7 10:58
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
