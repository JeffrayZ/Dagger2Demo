package com.example.demo16.engine;


import com.example.demo16.car.CarComponent;
import com.example.demo16.qualifier.QualifierEngineA;
import com.example.demo16.qualifier.QualifierEngineB;

import dagger.Component;

/**
 * 父组件，因为 car 依赖于 engine
 */
@Component(modules = EngineModule.class)
public interface EngineComponent {

    @QualifierEngineA
    Engine getEngineA();

    @QualifierEngineB
    Engine getEngineB();

    // 通过Builder暴露子组件
    CarComponent.Builder carComponent();
}
