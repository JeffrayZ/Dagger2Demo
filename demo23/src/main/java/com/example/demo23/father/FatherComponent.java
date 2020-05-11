package com.example.demo23.father;


import com.example.demo23.child.ChildComponent;

import dagger.Component;

/**
 *
 */
@Component(modules = FatherModule.class)
public interface FatherComponent {
    ChildComponent buildChildComponent();

    //如果ChildModule是有参构造方法
//    ChildComponent buildChildComponent(ChildModule childModule);
}
