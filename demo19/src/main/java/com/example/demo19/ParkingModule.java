package com.example.demo19;

import dagger.Module;
import dagger.Provides;

/**
 *
 */
@Module
public class ParkingModule {
    private String driver;
    public ParkingModule(String driver) {
        this.driver = driver;
    }
    
    @Provides
    public String provideDriver() {
        return driver;
    }

    @Provides
    public Bus provideBus() {
        return new Bus(driver);
    }
}
