package com.example.demo23.father;

import dagger.Module;
import dagger.Provides;

/**
 *
 */
@Module
public class FatherModule {
    @Provides
    public Father provideFather() {
        return new Father();
    }
}
