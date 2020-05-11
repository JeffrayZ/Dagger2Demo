package com.example.demo16.engine;


import com.example.demo16.car.CarComponent;
import com.example.demo16.qualifier.QualifierEngineA;
import com.example.demo16.qualifier.QualifierEngineB;

import dagger.Module;
import dagger.Provides;

/**
 */
@Module(subcomponents = CarComponent.class)
public class EngineModule {
    @Provides
    @QualifierEngineA
    Engine provideEngineA(){
        return new Engine(2);
    }

    @Provides
    @QualifierEngineB
    Engine provideEngineB(){
        return new Engine(4);
    }
}
