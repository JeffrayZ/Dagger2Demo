package com.example.demo14.engine;

import com.example.demo14.car.CarComponent;

import dagger.Component;

/**
 * 父组件，因为 car 依赖于 engine
 */
@Component(modules = EngineModule.class)
public interface EngineComponent {
    Engine getEngine();
    // 通过Builder暴露子组件
    CarComponent.Builder carComponent();
}
