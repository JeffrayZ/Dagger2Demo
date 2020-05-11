package com.example.demo12;

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

        Car car = DaggerCarComponent.builder().build().getCar();
        Log.i("MainActivity","cylinderNumbers : " + car.getEngine().getCylinderNumbers()+">>>>>>44444");
    }
}
