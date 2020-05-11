package com.example.demo23;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.demo23.child.Child;
import com.example.demo23.father.DaggerFatherComponent;
import com.example.demo23.father.FatherComponent;

import javax.inject.Inject;

public class ChildActivity extends AppCompatActivity {

    @Inject
    Child mChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FatherComponent fatherComponent = DaggerFatherComponent.builder().build();
//        fatherComponent.buildChildComponent(new ChildModule("大家OK镜")).inject(this);
        fatherComponent.buildChildComponent().inject(this);
        ((TextView) findViewById(R.id.text)).setText("注入成功 = " + mChild.toString());
    }
}
