package com.example.demo8.app;

import android.app.Application;

import com.example.demo8.bean.Accommodation;
import com.example.demo8.bean.Food;

import javax.inject.Singleton;

import dagger.Component;

/**
 */
@Component(modules = {AppModule.class})
public interface AppComponent {
    // 将AppModule中的Food、Accommodation暴露出来，以便于其他依赖于AppComponent的Component调用，
    // 也就是让后勤部门把食物和住宿提供出来
    Food getFood();
    Accommodation getAccommodation();
}
