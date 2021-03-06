package com.example.demo16.car;


import com.example.demo16.MainActivity;
import com.example.demo16.qualifier.QualifierCarA;
import com.example.demo16.qualifier.QualifierCarB;
import com.example.demo16.qualifier.ScopeCarA;
import com.example.demo16.qualifier.ScopeCarB;

import dagger.Subcomponent;

/**
 * 子组件
 */
@ScopeCarA
@ScopeCarB
@Subcomponent(modules = CarModule.class)
public interface CarComponent {
    void inject(MainActivity activity);

    @QualifierCarA
    Car getCarA();

    @QualifierCarB
    Car getCarB();

    //子组件必须要有一个Buidler声明，否则父组件不知道怎么构建子组件
    @Subcomponent.Builder
    interface Builder{
        // 可选的方法，不过如果不声明，就没法指定子组件的Module
        Builder carModule(CarModule module);
        // 创建子组件的方法，必须声明
        CarComponent build();
    }
}
