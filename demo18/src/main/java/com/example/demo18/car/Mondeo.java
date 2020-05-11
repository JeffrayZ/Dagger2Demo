package com.example.demo18.car;

import com.example.demo18.engine.Engine;

import javax.inject.Inject;

/**
 * @ProjectName: Dagger2Demo
 * @Package: com.example.demo18.car
 * @ClassName: Mondeo
 * @Description: java类作用描述
 * @Author: Jeffray
 * @CreateDate: 2020/5/9 19:34
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/5/9 19:34
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Mondeo extends Car {

    @Inject
    public Mondeo(Engine engine) {
        super(engine);
        mName = "mondeo";
        engine.mCylinderNumbers = 8;
    }
}
