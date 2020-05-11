package com.example.demo16.engine;


import com.example.demo16.Fuel;

/**
 */
public class Engine {
    public final int CYLINDER_FUEL_COST = 10;

    int mCylinderNumbers;

    public Engine(){
        mCylinderNumbers = 1;
    }

    public Engine(int cylinderNumbers){
        this.mCylinderNumbers = cylinderNumbers;
    }


    public int getCylinderNumbers(){
        return mCylinderNumbers;
    }


    public void run(Fuel fuel){
        fuel.burn(getCylinderNumbers() * CYLINDER_FUEL_COST);
    }
}
