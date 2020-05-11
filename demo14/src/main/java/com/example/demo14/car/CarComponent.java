package com.example.demo14.car;

import com.example.demo14.MainActivity;

import dagger.Subcomponent;

/**
 * 子组件
 */
@Subcomponent(modules = CarModule.class)
public interface CarComponent {
    void inject(MainActivity activity);
    Car getCar();

    //子组件必须要有一个Buidler声明，否则父组件不知道怎么构建子组件
    @Subcomponent.Builder
    interface Builder{
        // 可选的方法，不过如果不声明，就没法指定子组件的Module
        Builder carModule(CarModule module);
        // 创建子组件的方法，必须声明
        CarComponent build();
    }
}
