package com.example.demo13;

import dagger.Module;
import dagger.Provides;

/**
 */
@Module
public class EngineModule {
    @Provides
    Engine provideEngine(){
        return new Engine(2);
    }
}
