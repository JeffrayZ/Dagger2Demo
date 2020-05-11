package com.example.demo9;

import com.example.demo9.bean.Accommodation;
import com.example.demo9.bean.Food;

import dagger.Module;
import dagger.Provides;


/**
 * 供应者
 */
@Module
public class BeggarModule {
    @Provides
    public Employee provideEmployee(Food food, Accommodation accommodation) {
        // Employee 依赖 food、accommodation
        return new Employee(food, accommodation);
    }
}
