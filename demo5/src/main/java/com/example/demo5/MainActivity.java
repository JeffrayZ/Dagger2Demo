package com.example.demo5;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements IUploadView {

    @Inject
    UploadPresenter presenter1;

    @Inject
    UploadPresenter presenter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //注入实例
        DaggerMainActivityComponent.builder().build().inject(this);

        presenter1.showLog("presenter1 使用module~~~~~~~~~~~" + presenter1.toString());
        presenter2.showLog("presenter2 使用module~~~~~~~~~~~" + presenter2.toString());

//        D/UploadPresenter: presenter1 使用module~~~~~~~~~~~com.example.demo5.UploadPresenter@b2c996a
//        D/UploadPresenter: presenter2 使用module~~~~~~~~~~~com.example.demo5.UploadPresenter@b2c996a

        // @Scope作用是使同一个Component中供应的实例保持唯一。
        // 也就是说，如果我在另一个Activity中再创建了一个新的Component，那么它所提供的UploadPresenter实例也将是新的。这和我们理解的全局单例并不一样。
        // 所以，要想实现全局单例，那就要确保获取实例的Component一直都是同一个。
        // 如何实现呢？请看 demo6
    }
}
