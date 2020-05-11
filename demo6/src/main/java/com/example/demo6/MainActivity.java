package com.example.demo6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyApplication.mAppComponent.getActivityStackManager().pushOneActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        MyApplication.mAppComponent.getActivityStackManager().popOneActivity(this);
    }
}
