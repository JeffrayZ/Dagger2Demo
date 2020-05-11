package com.example.demo10.dagger;

import com.example.demo10.presenter.MainPresenter;
import com.example.demo10.view.IMainView;

import dagger.Module;
import dagger.Provides;

/**
 * @ProjectName: Dagger2Demo
 * @Package: com.example.demo10.dagger
 * @ClassName: MainModule
 * @Description: java类作用描述
 * @Author: Jeffray
 * @CreateDate: 2020/5/7 10:58
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/5/7 10:58
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

@Module
public class MainModule{
    private final IMainView mView;

    public MainModule(IMainView mView) {
        this.mView = mView;
    }

    @Provides
    IMainView providerMainView(){
        return mView;
    }

    @Provides
    MainPresenter providerMainPresenter(){
        return new MainPresenter(mView);
    }
}

