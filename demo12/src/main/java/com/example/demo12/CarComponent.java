package com.example.demo12;

import dagger.Component;

/**
 */
@Component(modules = EngineModule.class)
public interface CarComponent {
    Car getCar();
}
