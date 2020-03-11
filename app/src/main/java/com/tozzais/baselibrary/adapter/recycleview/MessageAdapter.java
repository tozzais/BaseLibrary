package com.tozzais.baselibrary.adapter.recycleview;


import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.module.LoadMoreModule;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.tozzais.baselibrary.R;

import org.jetbrains.annotations.NotNull;


/**
 *
 */
public class MessageAdapter extends BaseQuickAdapter<String, BaseViewHolder> implements LoadMoreModule {

    public MessageAdapter() {
        super(R.layout.item_one, null);
    }


    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, @NotNull  String s) {

    }
}
