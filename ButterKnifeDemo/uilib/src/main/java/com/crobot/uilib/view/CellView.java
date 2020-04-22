package com.crobot.uilib.view;


import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.Nullable;

import com.crobot.uilib.R;
import com.crobot.uilib.base.AbstractLinearLayout;
import com.crobot.uilib.base.BViewModel;
import com.crobot.uilib.databinding.ViewCellBinding;

/**
 * FileName: TestView
 * Author: peng.luo
 * Date: 2020/4/21 9:08
 * Description:
 * History:
 * <author> <time> <version> <desc>
 * 作者姓名 修改时间 版本号 描述
 */
public class CellView extends AbstractLinearLayout<CellView.CellViewModel> {

     ViewCellBinding viewCellBinding;

    public CellView(Context context) {
        super(context);
    }

    public CellView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CellView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CellView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public void setData(CellViewModel cellViewModel) {
        viewCellBinding.setMModel(cellViewModel);

    }

    @Override
    public boolean userDataBinding() {
        return true;
    }

    @Override
    public void initData() {
        viewCellBinding = (ViewCellBinding) viewDataBinding;


    }

    @Override
    public int getLayoutId() {
        return R.layout.view_cell;
    }



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
