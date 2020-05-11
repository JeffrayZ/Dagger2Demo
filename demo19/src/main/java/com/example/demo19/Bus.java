package com.example.demo19;

import javax.inject.Inject;

/**
 */
public class Bus {
    // 司机
    private String driver;

    @Inject
    public Bus(String driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "driver='" + driver + '\'' +
                '}';
    }
}
