package com.example.demo18.car;

import com.example.demo18.qualifier.QualifierMondeo;

import dagger.Binds;
import dagger.Module;

/**
 */
@Module
public abstract class CarModule {
    @Binds
    @QualifierMondeo
    abstract Car provideCarA(Mondeo mondeo);
}
