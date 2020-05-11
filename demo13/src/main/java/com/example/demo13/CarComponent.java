package com.example.demo13;

import dagger.Component;

/**
 */
@Component(dependencies = EngineComponent.class)
public interface CarComponent {
    void inject(Car car);
    Car getCar();
    void inject(MainActivity activity);
}
