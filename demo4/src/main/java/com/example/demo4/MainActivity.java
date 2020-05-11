package com.example.demo4;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity implements IUploadView {

    @HasParams
    @Inject
    UploadPresenter presenter1;

    @NoParams
    @Inject
    UploadPresenter presenter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //注入实例
        DaggerMainActivityComponent.builder().mainActivityModule(new MainActivityModule(this)).build().inject(this);

        presenter1.showLog("有参 presenter1 使用module~~~~~~~~~~~"+presenter1.toString()+":::"+presenter1.hashCode());
        presenter2.showLog("无参 presenter2 使用module~~~~~~~~~~~"+presenter2.toString()+":::"+presenter2.hashCode());
    }
}
