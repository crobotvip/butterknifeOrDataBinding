package com.crobot.uilib.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.crobot.uilib.R2;
import com.crobot.uilib.R;
import com.crobot.uilib.base.ImageBean;

import butterknife.BindView;

/**
 * Copyright (C), 2016-2020, 上海均瑶科创信息技术有限公司
 * FileName: ImageCellView
 * Author: peng.luo
 * Date: 2020/4/21 10:27
 * Description:
 * History:
 * <author> <time> <version> <desc>
 * 作者姓名 修改时间 版本号 描述
 */
public class ButterKnifeImageCellView extends AbstructModelLinearLayout<ImageBean> {


    @BindView(R2.id.iv_go)
    ImageView ivGo;
    @BindView(R2.id.tv_title)
    TextView tvTitle;

    public ButterKnifeImageCellView(Context context) {
        super(context);
    }

    public ButterKnifeImageCellView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ButterKnifeImageCellView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ButterKnifeImageCellView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @Override
    public void setData(ImageBean imageBean) {
        tvTitle.setText(imageBean.getTitle());

    }


    @Override
    public boolean userDataBinding() {
        return false;
    }

    @Override
    public void initData() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.view_image_cell_butterknife;
    }
}
