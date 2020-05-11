package com.example.demo10.presenter;

import com.example.demo10.MainActivity;
import com.example.demo10.view.IMainView;

import javax.inject.Inject;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

/**
 * @ProjectName: Dagger2Demo
 * @Package: com.example.demo10.presenter
 * @ClassName: MainPresenter
 * @Description: java类作用描述
 * @Author: Jeffray
 * @CreateDate: 2020/5/7 10:38
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/5/7 10:38
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MainPresenter {
    private IMainView mView;

    public MainPresenter(IMainView mView) {
        this.mView = mView;
    }

    public void loadData(){
        //调用model层方法，加载数据
//        ...
        //回调方法成功时
        mView.updateUI();
    }
}
