package com.crobot.uilib.base;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.databinding.DataBindingUtil;

import butterknife.ButterKnife;

/**
 * FileName: IViewBinder
 * Author: peng.luo
 * Date: 2020/4/17 12:29
 * Description: 约定规则
 * History:
 * <author> <time> <version> <desc>
 * 作者姓名 修改时间 版本号 描述
 */
public interface IViewBinder{


    /**
     * 默认方法，用来初始化布局绑定方式
     * @param layoutId
     * @param context
     * @param target
     */
    default void init(@LayoutRes int layoutId, Context context, ViewGroup target) {
        Object object = null;
        if (layoutId == 0) {
            throw new IllegalArgumentException("请选择布局文件");
        }
        boolean useDataBinding = userDataBinding();
        try{
            if (useDataBinding) {
                object = DataBindingUtil.inflate(LayoutInflater.from(context), layoutId, target, true);
            } else {
                View view = LayoutInflater.from(context).inflate(layoutId, target, true);
                object=ButterKnife.bind(this,view);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        if(object==null){
            return;
        }
        initObject(object);
        initData();


    }

    /**
     * 是否使用Databinding
     * @return
     */
    boolean userDataBinding();

    /**
     * 根据userDataBinding来判断返回对象是
     * @param object
     */
    void initObject(Object object);

    /**
     * 做一些初始化操作
     */
    void initData();

    /**
     * 自定义View布局ID
     * @return
     */
    int getLayoutId();






}
