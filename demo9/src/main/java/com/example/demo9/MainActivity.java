package com.example.demo9;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.demo9.app.AppComponent;
import com.example.demo9.app.AppModule;
import com.example.demo9.app.DaggerAppComponent;
import com.example.demo9.bean.Accommodation;
import com.example.demo9.bean.Food;
import com.example.demo9.bean.Salary;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Employee employee;
    @Inject
    Food food;
    @Inject
    Accommodation accommodation;
    //可以直接注入，不会报错，也就是说财务部门给府内正式员工准备了工钱，所以可以拿到
    @Inject
    Salary salary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //注入实例
        AppComponent appComponent = DaggerAppComponent.builder().appModule(new AppModule()).build();
        appComponent.addEmployee(new BeggarModule()).inject(this);

        Log.d("Employee", food.toString());
        Log.d("Employee", accommodation.toString());
        Log.d("Employee", salary.toString());
        Log.d("Employee", employee.toString());
    }
}
//
//此种方式可以理解为：
// 乞丐举牌说谁给食物和住宿就给谁府上打工，此时地主看到后只需addEmployee即可把该乞丐招入府中为正式员工，
// 府内的后勤部除了给与员工除食物和住宿外，还给予了工钱，爽歪歪啊。
