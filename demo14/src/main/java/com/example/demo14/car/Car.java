package com.example.demo14.car;

import com.example.demo14.engine.Engine;

import javax.inject.Inject;

/**
 */
public class Car {
    String mName;

    @Inject
    Engine mEngine;

    @Inject
    public Car(Engine engine){
        mEngine = engine;
    }

    public String getName(){
        return mName;
    }

    public Engine getEngine(){
        return mEngine;
    }
}
