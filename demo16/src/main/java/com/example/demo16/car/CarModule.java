package com.example.demo16.car;

import com.example.demo16.engine.Engine;
import com.example.demo16.qualifier.QualifierCarA;
import com.example.demo16.qualifier.QualifierCarB;
import com.example.demo16.qualifier.QualifierEngineA;
import com.example.demo16.qualifier.QualifierEngineB;
import com.example.demo16.qualifier.ScopeCarA;

import dagger.Module;
import dagger.Provides;

/**
 */
@Module
public class CarModule {
    @Provides
    @QualifierCarA
    @ScopeCarA
    Car provideCarA(@QualifierEngineA Engine engine){
        return new Car(engine);
    }

    @Provides
    @QualifierCarB
    Car provideCarB(@QualifierEngineB Engine engine){
        return new Car(engine);
    }
}
