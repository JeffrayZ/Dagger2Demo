package com.example.demo7;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;
import javax.inject.Provider;

import dagger.Lazy;

public class MainActivity extends AppCompatActivity {

    // 延时初始化
    @Inject
    Lazy<UploadPresenter> lazyPresenter;

    // 延时初始化
    @Inject
    Provider<UploadPresenter> providerPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //注入实例
        DaggerMainActivityComponent.builder()
                .build().inject(this);

        //调用Lazy的get()方法后才开始初始化Presenter并得到该实例
        //并且后面每次调用get()方法得到的实例都将是同一个。
        lazyPresenter.get().showLog("lazyPresenter 使用module~~~~~~~~~~~");

        //调用Provider的get()方法后才开始初始化Presenter并得到该实例
        //并且后面每次调用get()方法，都会重新调用供应端的供应方法来获取新实例。
        providerPresenter.get().showLog("providerPresenter 使用module~~~~~~~~~~~");
    }
}
