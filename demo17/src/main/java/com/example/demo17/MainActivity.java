package com.example.demo17;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.demo17.car.Car;
import com.example.demo17.car.CarComponent;
import com.example.demo17.car.CarModule;
import com.example.demo17.engine.DaggerEngineComponent;
import com.example.demo17.engine.EngineModule;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ========================================分割线==============================================================
        CarComponent carComponent = DaggerEngineComponent.builder().engineModule(new EngineModule())
                .build().carComponent().carModule(new CarModule()).build();

        Car carA1 = carComponent.getCarA();
        Car carA2 = carComponent.getCarA();
        Car carA3 = carComponent.getCarA();

        Log.i("MainActivity", "carA1 : " + carA1 + "; cylinderNumbers : " + carA1.getEngine().getCylinderNumbers());
        Log.i("MainActivity", "carA2 : " + carA2 + "; cylinderNumbers : " + carA2.getEngine().getCylinderNumbers());
        Log.i("MainActivity", "carA3 : " + carA3 + "; cylinderNumbers : " + carA3.getEngine().getCylinderNumbers());


        Car carB1 = carComponent.getCarB();
        Car carB2 = carComponent.getCarB();
        Car carB3 = carComponent.getCarB();

        Log.i("MainActivity", "carB1 : " + carB1 +  "; cylinderNumbers : " + carB1.getEngine().getCylinderNumbers());
        Log.i("MainActivity", "carB2 : " + carB2 +  "; cylinderNumbers : " + carB2.getEngine().getCylinderNumbers());
        Log.i("MainActivity", "carB3 : " + carB3 +  "; cylinderNumbers : " + carB3.getEngine().getCylinderNumbers());

    }
}
