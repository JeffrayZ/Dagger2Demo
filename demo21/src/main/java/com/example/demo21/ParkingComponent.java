package com.example.demo21;

import dagger.Component;

/**
 */
@SignLocal
@Component(modules = ParkingModule.class)
public interface ParkingComponent {
    void inject(ParkingActivity activity);
}
