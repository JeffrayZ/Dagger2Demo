package com.example.demo18.engine;

import com.example.demo18.car.CarComponent;
import com.example.demo18.qualifier.QualifierMondeo;

import dagger.Component;

/**
 * 父组件，因为 car 依赖于 engine
 */
@Component(modules = EngineModule.class)
public interface EngineComponent {

    @QualifierMondeo
    Engine getEngineA();

    Engine getEngineB();

    // 通过Builder暴露子组件
    CarComponent.Builder carComponent();
}
