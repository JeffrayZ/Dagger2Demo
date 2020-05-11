package com.example.demo13;

import dagger.Component;

/**
 */
@Component(modules = EngineModule.class)
public interface EngineComponent {
    Engine getEngine();
}
