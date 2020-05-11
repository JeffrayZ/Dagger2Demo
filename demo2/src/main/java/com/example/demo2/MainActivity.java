package com.example.demo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements IUploadView {

    @Inject
    UploadPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //注入实例
        DaggerMainActivityComponent.builder().getUploadView(this).build().inject(this);


        presenter.showLog("使用module~~~~~~~~~~~");
    }
}
