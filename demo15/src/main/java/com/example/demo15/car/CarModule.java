package com.example.demo15.car;

import com.example.demo15.engine.Engine;
import com.example.demo15.qualifier.QualifierCarA;
import com.example.demo15.qualifier.QualifierCarB;
import com.example.demo15.qualifier.QualifierEngineA;
import com.example.demo15.qualifier.QualifierEngineB;

import dagger.Module;
import dagger.Provides;

/**
 */
@Module
public class CarModule {
    @Provides
    @QualifierCarA
    Car provideCarA(@QualifierEngineA Engine engine){
        return new Car(engine);
    }

    @Provides
    @QualifierCarB
    Car provideCarB(@QualifierEngineB Engine engine){
        return new Car(engine);
    }
}
