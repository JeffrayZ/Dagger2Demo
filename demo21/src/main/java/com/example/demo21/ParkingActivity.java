package com.example.demo21;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

public class ParkingActivity extends AppCompatActivity {

    @Sign("laoWang")
    @Inject
    Bus mBus1;

    @Sign("laoWang")
    @Inject
    Bus mBus2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerParkingComponent.builder().build().inject(this);
        // hashcode值一样说明指向的是同一个内存地址
        ((TextView) findViewById(R.id.text)).setText(mBus1.hashCode()+"::"+mBus1.toString());
        ((TextView) findViewById(R.id.text2)).setText(mBus2.hashCode()+"::"+mBus2.toString());
    }
}
