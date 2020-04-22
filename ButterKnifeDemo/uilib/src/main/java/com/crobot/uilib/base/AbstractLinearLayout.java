package com.crobot.uilib.base;

import android.content.Context;

import android.util.AttributeSet;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.databinding.ViewDataBinding;

import butterknife.Unbinder;

/**
 * FileName: AbstractLinearLayout
 * Author: peng.luo
 * Date: 2020/4/17 12:10
 * Description: 抽象的线性布局
 * History:
 * <author> <time> <version> <desc>
 * 作者姓名 修改时间 版本号 描述
 */
public abstract class AbstractLinearLayout<T extends BViewModel> extends LinearLayout implements IViewBinder {

    private Unbinder unbinder;
    protected ViewDataBinding viewDataBinding;

    public AbstractLinearLayout(Context context) {
        super(context);
        init(getLayoutId(),context,this);
    }


    public AbstractLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(getLayoutId(),context,this);
    }

    public AbstractLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(getLayoutId(),context,this);
    }

    public AbstractLinearLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(getLayoutId(),context,this);
    }

    @Override
    public void initObject(Object object) {

        if(userDataBinding()){
            viewDataBinding= (ViewDataBinding) object;
        }else{
            unbinder= (Unbinder) object;
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        unbinder = null;
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (unbinder != null)
            unbinder.unbind();
        if(viewDataBinding!=null){
            viewDataBinding.unbind();
        }

    }
    public abstract void setData(T t);
}
