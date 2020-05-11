package com.example.demo18.engine;

import com.example.demo18.car.CarComponent;
import com.example.demo18.qualifier.QualifierMondeo;

import dagger.Module;
import dagger.Provides;

/**
 */
@Module(subcomponents = CarComponent.class)
public class EngineModule {
    @Provides
    @QualifierMondeo
    Engine provideEngineA(){
        return new Engine(2);
    }

    @Provides
    Engine provideEngineB(){
        return new Engine(4);
    }
}
