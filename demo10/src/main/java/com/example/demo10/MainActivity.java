package com.example.demo10;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.demo10.dagger.DaggerMainComponent;
import com.example.demo10.dagger.MainModule;
import com.example.demo10.presenter.MainPresenter;
import com.example.demo10.view.IMainView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements IMainView {

    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainComponent.builder().mainModule(new MainModule(this)).build().inject(this);

        //调用Presenter方法加载数据
        mainPresenter.loadData();
    }

    @Override
    public void updateUI() {
        Log.d("MainActivity",">>>>>>>>>>>>>>updateUI<<<<<<<<<<<<<<<");
    }
}
