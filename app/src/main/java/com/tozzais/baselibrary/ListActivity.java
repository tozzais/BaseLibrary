package com.tozzais.baselibrary;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.tozzais.baselibrary.list.MessageFragment;
import com.tozzais.baselibrary.statusbar_style.StatusBarActivity;
import com.tozzais.baselibrary.ui.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;


public class ListActivity extends BaseActivity {


    public static void launch(Context context) {
        Intent intent = new Intent(context, ListActivity.class);
        context.startActivity(intent);

    }

    @Override
    public int getLayoutId() {
        return R.layout.base_content;
    }

    @Override
    public void initView(Bundle savedInstanceState) {
        setBackTitle("列表");
//        setRightText("切换");


        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.content_container, new MessageFragment()).commit();
    }


    @Override
    public void loadData() {




    }



}
