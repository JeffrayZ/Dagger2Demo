package com.example.demo15;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.demo15.car.Car;
import com.example.demo15.car.CarComponent;
import com.example.demo15.car.CarModule;
import com.example.demo15.engine.DaggerEngineComponent;
import com.example.demo15.engine.EngineModule;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ========================================分割线==============================================================
        CarComponent carComponent = DaggerEngineComponent.builder().engineModule(new EngineModule())
                .build().carComponent().carModule(new CarModule()).build();

        Car carA = carComponent.getCarA();
        Car carB = carComponent.getCarB();
        Log.i("MainActivity", "cylinderNumbers : " + carA.getEngine().getCylinderNumbers() + ">>>>>>111111");
        Log.i("MainActivity", "cylinderNumbers : " + carB.getEngine().getCylinderNumbers() + ">>>>>>222222");
    }
}
