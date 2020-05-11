package com.example.demo15.engine;


import com.example.demo15.car.CarComponent;
import com.example.demo15.qualifier.QualifierEngineA;
import com.example.demo15.qualifier.QualifierEngineB;

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
