package com.example.demo20;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

public class ParkingActivity extends AppCompatActivity {

    @Sign("laoWang")
    @Inject
    Bus mBus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerParkingComponent.builder().build().inject(this); //DaggerParkingComponent类需要编译才会生成

        ((TextView) findViewById(R.id.text)).setText(mBus.toString());
    }
}
