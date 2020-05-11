package com.example.demo18.car;

import com.example.demo18.engine.Engine;

import javax.inject.Inject;

/**
 */
public class Car {
    String mName;
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
