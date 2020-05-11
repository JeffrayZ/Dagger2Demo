package com.example.demo17.car;

import com.example.demo17.engine.Engine;
import com.example.demo17.qualifier.QualifierCarA;
import com.example.demo17.qualifier.QualifierCarB;
import com.example.demo17.qualifier.QualifierEngineA;
import com.example.demo17.qualifier.QualifierEngineB;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 */
@Module
public class CarModule {
    @Provides
    @QualifierCarA
    @Singleton
    Car provideCarA(@QualifierEngineA Engine engine){
        return new Car(engine);
    }

    @Provides
    @QualifierCarB
    Car provideCarB(@QualifierEngineB Engine engine){
        return new Car(engine);
    }
}
