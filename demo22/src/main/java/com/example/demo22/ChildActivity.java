package com.example.demo22;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.demo22.child.Child;
import com.example.demo22.father.DaggerFatherComponent;
import com.example.demo22.father.FatherComponent;

import javax.inject.Inject;

public class ChildActivity extends AppCompatActivity {

    @Inject
    Child mChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        FatherComponent fatherComponent = DaggerFatherComponent.builder().build();
//        DaggerChildComponent.builder().fatherComponent(fatherComponent).build().inject(this);//Component类需要编译才会生成
//        ((TextView) findViewById(R.id.text)).setText("注入成功 = " + mChild.toString());

        FatherComponent fatherComponent = DaggerFatherComponent.builder().build();
//        fatherComponent.buildChildComponent().requestModule(new ChildModule("大家OK镜")).build().inject(this);
        fatherComponent.buildChildComponent().build().inject(this);
        ((TextView) findViewById(R.id.text)).setText("注入成功 = " + mChild.toString());
    }
}
