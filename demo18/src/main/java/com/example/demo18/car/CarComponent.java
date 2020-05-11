package com.example.demo18.car;


import com.example.demo18.qualifier.QualifierMondeo;

import dagger.Subcomponent;

/**
 * 子组件
 */
@Subcomponent(modules = CarModule.class)
public interface CarComponent {

    @QualifierMondeo
    Car getCarA();

    Car getCarB();

    //子组件必须要有一个Buidler声明，否则父组件不知道怎么构建子组件
    @Subcomponent.Builder
    interface Builder{
        // 创建子组件的方法，必须声明
        CarComponent build();
    }
}
