package com.example.demo22.father;

import com.example.demo22.child.ChildComponent;

import dagger.Module;
import dagger.Provides;

/**
 *
 */
@Module(subcomponents = ChildComponent.class)
public class FatherModule {
    @Provides
    public Father provideFather() {
        return new Father();
    }
}
