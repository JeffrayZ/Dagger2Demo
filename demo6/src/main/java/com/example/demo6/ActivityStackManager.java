package com.example.demo6;

import android.app.Activity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @ProjectName: Dagger2Demo
 * @Package: com.example.demo6
 * @ClassName: ActivityStackManager
 * @Description: java类作用描述
 * @Author: Jeffray
 * @CreateDate: 2020/5/6 14:05
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/5/6 14:05
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ActivityStackManager {
    private ArrayList list = new ArrayList<Activity>();

    public void pushOneActivity(Activity activity){
        list.add(activity);
    }

    public void popOneActivity(Activity activity){
        list.remove(activity);
    }
}
