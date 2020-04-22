package com.crobot.uilib.view;


import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.Nullable;

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
public abstract class AbstructModelRelativeLayout<V extends BViewModel> extends AbstractLinearLayout<V> {

    ViewCellBinding viewCellBinding;

    public AbstructModelRelativeLayout(Context context) {
        super(context);
    }

    public AbstructModelRelativeLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public AbstructModelRelativeLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public AbstructModelRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


}
