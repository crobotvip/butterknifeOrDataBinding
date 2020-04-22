package com.crobot.uilib.view;


import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.Nullable;

import com.crobot.uilib.R;
import com.crobot.uilib.base.AbstractLinearLayout;
import com.crobot.uilib.base.BViewModel;
import com.crobot.uilib.databinding.ViewCEditViewBinding;
import com.crobot.uilib.databinding.ViewCellBinding;

/**
 * Copyright (C), 2016-2020, 上海均瑶科创信息技术有限公司
 * FileName: TestView
 * Author: peng.luo
 * Date: 2020/4/21 9:08
 * Description:
 * History:
 * <author> <time> <version> <desc>
 * 作者姓名 修改时间 版本号 描述
 */
public class CEditView extends AbstractLinearLayout<CEditView.CellViewModel> {


    private ViewCEditViewBinding viewCEditViewBinding;

    public CEditView(Context context) {
        super(context);
    }

    public CEditView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CEditView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CEditView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void setData(CellViewModel cellViewModel) {

    }

    @Override
    public boolean userDataBinding() {
        return true;
    }

    @Override
    public void initData() {

        viewCEditViewBinding = (ViewCEditViewBinding) viewDataBinding;


    }

    @Override
    public int getLayoutId() {
        return R.layout.view_c_edit_view;
    }

//    @Override
//    public void setData(Object object) {
//        CellViewModel cellViewModel= (CellViewModel) object;
//        viewCEditViewBinding.setMModel(cellViewModel);
//
//    }


    public static class CellViewModel extends BViewModel {
        private String title;
        private String value;

        public CellViewModel(String title, String value) {
            this.title = title;
            this.value = value;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
