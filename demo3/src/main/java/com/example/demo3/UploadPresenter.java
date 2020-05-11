package com.example.demo3;

import android.util.Log;

/**
 * @ProjectName: Dagger2Demo
 * @Package: com.example.dagger2demo
 * @ClassName: UploadPresenter
 * @Description: java类作用描述
 * @Author: Jeffray
 * @CreateDate: 2020/4/28 17:18
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/4/28 17:18
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class UploadPresenter {
    public UploadPresenter() {
        Log.d("UploadPresenter", "无参构造方法");
    }

    // 构造方法需要传入参数
    IUploadView mIView;
    public UploadPresenter(IUploadView iview) {
        Log.d("UploadPresenter", "有参构造方法");
        mIView = iview;
    }

    public void showLog(String msg) {
        Log.d("UploadPresenter", msg);
    }
}
