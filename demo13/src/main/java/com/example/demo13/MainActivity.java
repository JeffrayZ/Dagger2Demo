package com.example.demo13;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car mCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ========================================分割线==============================================================

        Car car = DaggerCarComponent.builder().engineComponent(DaggerEngineComponent.create()).build().getCar();
        Log.i("MainActivity","cylinderNumbers : " + car.getEngine().getCylinderNumbers()+">>>>>>44444");

        // ========================================分割线==============================================================
        DaggerCarComponent.builder().engineComponent(DaggerEngineComponent.create()).build().inject(this);
        Log.i("MainActivity","cylinderNumbers : " + mCar.getEngine().getCylinderNumbers() + ">>>>>>55555");
    }
}
