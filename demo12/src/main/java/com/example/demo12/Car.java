package com.example.demo12;

import javax.inject.Inject;

/**
 */
public class Car {
    Engine mEngine;
    @Inject
    public Car(Engine engine){
        mEngine = engine;
    }

    public Engine getEngine() {
        return mEngine;
    }
}
