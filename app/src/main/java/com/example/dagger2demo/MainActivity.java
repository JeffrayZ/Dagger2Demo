package com.example.dagger2demo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements IUploadView {

//    假如你并不希望在调用inject()方法后，就对@Inject标注的实例进行初始化注入，而是希望在用到该实例的时候再进行初始化，
//    那么我们就可以使用Lazy<T>和Provider<T>来实现。
    // 请看 Demo7
    @Inject
    UploadPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //注入实例
//        DaggerMainActivityComponent.builder()
//                .build()
//                .inject(this);

        DaggerMainActivityComponent.builder()
                .mainActivityModule(new MainActivityModule(this))
                .build().inject(this);

        presenter.showLog("使用module~~~~~~~~~~~");
    }
}
