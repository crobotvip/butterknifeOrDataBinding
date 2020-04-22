package com.crobot.uilib.view;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.Nullable;

import com.crobot.uilib.R;
import com.crobot.uilib.base.ImageBean;

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
public class ImageCellView extends AbstructModelLinearLayout<ImageBean> {
    public ImageCellView(Context context) {
        super(context);
    }

    public ImageCellView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ImageCellView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ImageCellView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @Override
    public void setData(ImageBean imageBean) {

    }


    @Override
    public boolean userDataBinding() {
        return true;
    }

    @Override
    public void initData() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.view_image_cell;
    }
}
