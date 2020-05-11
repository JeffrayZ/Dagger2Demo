package com.example.demo14;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.demo14.car.Car;
import com.example.demo14.car.CarModule;
import com.example.demo14.engine.DaggerEngineComponent;
import com.example.demo14.engine.EngineModule;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ========================================分割线==============================================================
        Car car = DaggerEngineComponent.builder().engineModule(new EngineModule()).build().carComponent().carModule(new CarModule()).build().getCar();
        Log.i("MainActivity", "cylinderNumbers : " + car.getEngine().getCylinderNumbers() + ">>>>>>44444");
    }
}
