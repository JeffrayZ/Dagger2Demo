package com.example.demo17.engine;


import com.example.demo17.car.CarComponent;
import com.example.demo17.qualifier.QualifierEngineA;
import com.example.demo17.qualifier.QualifierEngineB;

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
