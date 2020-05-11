package com.example.demo8;

import android.app.Application;
import android.util.Log;

import com.example.demo8.bean.Accommodation;
import com.example.demo8.bean.Food;

/**
 *
 */
public class Employee {
    public Employee() {
    }

    public Employee(Application application) {
        Log.d("Employee", application.toString());
    }

    public Employee(Food food, Accommodation accommodation) {
        Log.d("Employee", food.toString()+"++++"+accommodation.toString());
    }

    public void showLog(String msg) {
        Log.d("Employee", msg);
    }
}
