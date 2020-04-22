package com.crobot.uilib.base;

import android.content.Context;

import android.util.AttributeSet;
import android.widget.RelativeLayout;

import androidx.databinding.ViewDataBinding;

import butterknife.Unbinder;

/**
 * FileName: AbstractRelativeLayout
 * Author: peng.luo
 * Date: 2020/4/17 12:32
 * Description:
 * History:
 * <author> <time> <version> <desc>
 * 作者姓名 修改时间 版本号 描述
 */
public abstract class AbstractRelativeLayout extends RelativeLayout implements IViewBinder {
    private Unbinder unbinder;
    protected ViewDataBinding viewDataBinding;
    public AbstractRelativeLayout(Context context) {
        super(context);
        init(getLayoutId(),context,this);
    }

    public AbstractRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(getLayoutId(),context,this);
    }

    public AbstractRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(getLayoutId(),context,this);
    }

    public AbstractRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(getLayoutId(),context,this);
    }


    @Override
    public boolean userDataBinding() {
        return false;
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
    public void initData() {

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


}
