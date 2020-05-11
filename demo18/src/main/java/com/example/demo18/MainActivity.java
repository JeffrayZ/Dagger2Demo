package com.example.demo18;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.demo18.car.Car;
import com.example.demo18.car.CarComponent;
import com.example.demo18.engine.DaggerEngineComponent;
import com.example.demo18.engine.EngineComponent;
import com.example.demo18.engine.EngineModule;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EngineComponent engineComponent = DaggerEngineComponent.builder()
                .engineModule(new EngineModule())
                .build();
        testCar(engineComponent);
    }

    private void testCar(EngineComponent engineComponent) {
        CarComponent carComponent = engineComponent.carComponent().build();
        Car carA = carComponent.getCarA();
        Car carB = carComponent.getCarB();
        Log.i("MainActivity", "carA : " + carA + "; name : " + carA.getName() + "; cylinders : " + carA.getEngine().getCylinderNumbers());
        Log.i("MainActivity", "carB : " + carB + "; name : " + carB.getName() + "; cylinders : " + carB.getEngine().getCylinderNumbers());
    }
}
