package com.example.demo9.app;

import com.example.demo9.BeggarComponent;
import com.example.demo9.BeggarModule;

import dagger.Component;

/**
 */
@Component(modules = {AppModule.class})
public interface AppComponent {
    // 需要将SubComponent 追加到 被依赖的Component中，即把乞丐招进府内做工
    BeggarComponent addEmployee(BeggarModule beggarModule);
}
