package com.example.demo19;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

public class ParkingActivity extends AppCompatActivity {

    @Sign
    @Inject
    Bus mBus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // java01、java02
//        DaggerParkingComponent.create().inject(this); //DaggerParkingComponent类需要编译才会生成
        DaggerParkingComponent.builder().parkingModule(new ParkingModule("楼下老李")).build().inject(this);

        ((TextView) findViewById(R.id.text)).setText(mBus.toString());
    }
}
