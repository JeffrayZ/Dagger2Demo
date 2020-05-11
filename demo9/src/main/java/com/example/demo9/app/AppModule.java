package com.example.demo9.app;


import com.example.demo9.bean.Accommodation;
import com.example.demo9.bean.Food;
import com.example.demo9.bean.Salary;

import dagger.Module;
import dagger.Provides;

/**
 */
@Module
public class AppModule {//地主的后勤部门
    @Provides
    public Food provideFood() {  //后勤提供食物
        return new Food();
    }
    @Provides
    public Accommodation provideAccommodation() { //后勤提供住宿
        return new Accommodation();
    }
    @Provides
    public Salary provideSalary() { //提供工钱
        return new Salary();
    }
}
