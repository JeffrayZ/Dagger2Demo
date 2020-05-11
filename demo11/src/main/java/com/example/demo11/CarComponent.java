package com.example.demo11;

import dagger.Component;

/**
 */
@Component
public interface CarComponent {
    void inject(Car car);
    Car getCar();
    void inject(MainActivity activity);
}
