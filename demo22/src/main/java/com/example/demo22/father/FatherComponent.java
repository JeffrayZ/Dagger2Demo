package com.example.demo22.father;

import com.example.demo22.child.ChildComponent;

import dagger.Component;

/**
 *
 */
@Component(modules = FatherModule.class)
public interface FatherComponent {
    ChildComponent.Builder buildChildComponent();
}
