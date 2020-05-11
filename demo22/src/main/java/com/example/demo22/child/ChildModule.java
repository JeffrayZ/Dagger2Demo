package com.example.demo22.child;

import android.util.Log;

import com.example.demo22.father.Father;

import dagger.Module;
import dagger.Provides;

/**
 *
 */
@Module
public class ChildModule {
    public ChildModule() {
        Log.i("ChildModule","ChildModule 无参");
    }

    public ChildModule(String tag) {
        Log.i("ChildModule","ChildModule 有参" + tag);
    }

    @Provides
    public Child provideChild(Father father) {
        return new Child(father);
    }
}
