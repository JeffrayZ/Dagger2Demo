package com.example.demo14.engine;

import com.example.demo14.car.CarComponent;

import dagger.Module;
import dagger.Provides;

/**
 */
@Module(subcomponents = CarComponent.class)
public class EngineModule {
    @Provides
    Engine provideEngine(){
        return new Engine(2);
    }
}
