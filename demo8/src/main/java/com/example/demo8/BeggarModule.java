package com.example.demo8;

import android.app.Application;

import com.example.demo8.bean.Accommodation;
import com.example.demo8.bean.Food;

import dagger.Module;
import dagger.Provides;


/**
 * 供应者
 */
@Module
class BeggarModule {
    @Provides
    public Employee provideEmployee(Food food, Accommodation accommodation) {
        // Employee 依赖 food、accommodation
        return new Employee(food, accommodation);
    }
}
