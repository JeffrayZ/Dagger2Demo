package com.example.demo19;

import dagger.Component;

/**
 */
@Component(modules = ParkingModule.class)
public interface ParkingComponent {
    void inject(ParkingActivity activity);
}
