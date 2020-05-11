package com.example.demo22.child;

import com.example.demo22.ChildActivity;

import dagger.Subcomponent;

/**
 * 子依赖于父
 */
@Subcomponent(modules = ChildModule.class)
public interface ChildComponent {
    void inject(ChildActivity activity);

    @Subcomponent.Builder
    interface Builder {
        ChildComponent build();
//        如果@Subcomponent指向的@Module是有参构造方法，写法如下，并且需要在build()方法调用前实例@Module
        Builder requestModule(ChildModule module);
    }
}
