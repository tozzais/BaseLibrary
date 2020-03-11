package com.tozzais.baselibrary.list;

import android.os.Bundle;
import android.os.Handler;

import com.tozzais.baselibrary.adapter.recycleview.MessageAdapter;
import com.tozzais.baselibrary.ui.BaseListFragment;
import com.tozzais.baselibrary.util.DataUtil;
import com.tozzais.baselibrary.util.log.LogUtil;


public class MessageFragment extends BaseListFragment<String> {




    public static MessageFragment newInstance(int type){
        MessageFragment cartFragment = new MessageFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("type",type);
        cartFragment.setArguments(bundle);
        return cartFragment;

    }


    @Override
    public void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        mAdapter = new MessageAdapter();
        mRecyclerView.setAdapter(mAdapter);
        setEmptyView("暂无消息");

    }

    @Override
    public void loadData() {
        super.loadData();
        getData();
    }


    private int i = 0;

    private void getData(){
        LogUtil.e("page = "+page+","+"PageSize = "+PageSize);
        new Handler().postDelayed(()->{
            swipeLayout.setRefreshing(false);
            setData(DataUtil.getData(5));
        },500);
    }

}
