package com.tozzais.baselibrary;

import android.app.Application;

import com.chad.library.adapter.base.module.LoadMoreModuleConfig;
import com.tozzais.baselibrary.loadmore.CustomLoadMoreView;

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // 在 Application 中配置全局自定义的 LoadMoreView
        LoadMoreModuleConfig.setDefLoadMoreView(new CustomLoadMoreView());
    }
}
