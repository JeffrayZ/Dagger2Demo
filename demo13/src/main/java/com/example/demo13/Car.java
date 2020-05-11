package com.example.demo13;

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

    Engine getEngine(){
        return mEngine;
    }
}
