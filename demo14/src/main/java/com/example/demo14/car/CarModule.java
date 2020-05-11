package com.example.demo14.car;

import com.example.demo14.engine.Engine;

import dagger.Module;
import dagger.Provides;

/**
 */
@Module
public class CarModule {
    @Provides
    Car provideCar(Engine engine){
        return new Car(engine);
    }
}
