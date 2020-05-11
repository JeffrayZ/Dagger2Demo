package com.example.demo20;

import dagger.Module;
import dagger.Provides;

/**
 *
 */
@Module
public class ParkingModule {

    @Sign("noDriver")
    @Provides
    public Bus provideBus() {
        return new Bus();
    }

    @Sign("laoWang")
    @Provides
    public Bus provideBusHasDriver() {
        return new Bus("隔壁老王");
    }
}
