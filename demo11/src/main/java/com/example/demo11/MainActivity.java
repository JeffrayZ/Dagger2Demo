package com.example.demo11;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car mCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Engine engine = DaggerEngineComponent.builder().build().getEngine();
//        Car car = new Car(engine);
//        Log.i("MainActivity","cylinderNumbers : " + car.getEngine().getCylinderNumbers()+">>>>>>22222");

        // ========================================分割线==============================================================

//        如果我们在组件中声明了注入或者需求类型，Dagger2会根据声明的类型自动查找这个类型依赖的所有的其他需求类型，
//        并在注入组件中帮我们一一实现需求的创建
//        Car car = new Car(null);
//        DaggerCarComponent.builder().build().inject(car);
//        Log.i("MainActivity","cylinderNumbers : " + car.getEngine().getCylinderNumbers()+">>>>>>33333");

        // ========================================分割线==============================================================

//        Car car = DaggerCarComponent.builder().build().getCar();
//        Log.i("MainActivity","cylinderNumbers : " + car.getEngine().getCylinderNumbers()+">>>>>>44444");

        // ========================================分割线==============================================================
        DaggerCarComponent.builder().build().inject(this);
        Log.i("MainActivity","cylinderNumbers : " + mCar.getEngine().getCylinderNumbers() + ">>>>>>55555");
    }
}
