package com.example.demo23.child;

import com.example.demo23.ChildActivity;

import dagger.Subcomponent;

/**
 * 子依赖于父
 */
@Subcomponent(modules = ChildModule.class)
public interface ChildComponent {
    void inject(ChildActivity activity);
}
