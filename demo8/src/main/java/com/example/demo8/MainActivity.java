package com.example.demo8;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.demo8.app.AppComponent;
import com.example.demo8.app.AppModule;
import com.example.demo8.app.DaggerAppComponent;
import com.example.demo8.bean.Accommodation;
import com.example.demo8.bean.Food;
import com.example.demo8.bean.Salary;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Employee employee;
    @Inject
    Food food;
    @Inject
    Accommodation accommodation;
    //无法编译通过，因为Salary 在AppComponent 中没有显示的，也就是说虽然财务部门准备了工钱，可是地主没说要提供出去，
    // 也就是在AppComponent没把工钱暴露出去
//    @Inject
//    Salary salary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //注入实例
//        DaggerMainActivityComponent.builder()
//                .build().inject(this);
        AppComponent appComponent = DaggerAppComponent.builder().appModule(new AppModule()).build();

        DaggerBeggarComponent.builder().appComponent(appComponent).build().inject(this);

        Log.d("Employee", food.toString());
        Log.d("Employee", accommodation.toString());
        Log.d("Employee", employee.toString());
    }
}

//这种方法整体意思就是说地主发布通知说提供食物和住宿来招聘工人，乞丐看到后，愿意去到府内工作
