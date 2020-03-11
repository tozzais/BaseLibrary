package com.tozzais.baselibrary;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.tozzais.baselibrary.statusbar_style.StatusBarActivity;
import com.tozzais.baselibrary.ui.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;


public class MainActivity extends BaseActivity {


    @BindView(R.id.button)
    TextView button;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        setBackTitle("首页");
        setRightText("设置");


    }


    @Override
    public void loadData() {
//        new Handler().postDelayed(() -> showContent(), 1000);

        showContent();



    }


    @OnClick({R.id.button, R.id.button1, R.id.button2})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                StatusBarActivity.launch(mActivity);
                break;
            case R.id.button1:
                PermissionActivity.launch(mActivity);
                break;
            case R.id.button2:
                ListActivity.launch(mActivity);
                break;
        }
    }
}
