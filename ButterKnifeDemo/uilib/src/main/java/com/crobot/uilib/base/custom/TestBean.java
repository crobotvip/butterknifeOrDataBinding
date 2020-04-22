package com.crobot.uilib.base.custom;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.crobot.uilib.BR;
import com.crobot.uilib.base.BViewModel;

/**
 * Copyright (C), 2016-2020, 上海均瑶科创信息技术有限公司
 * FileName: TestBean
 * Author: peng.luo
 * Date: 2020/4/21 13:12
 * Description:
 * History:
 * <author> <time> <version> <desc>
 * 作者姓名 修改时间 版本号 描述
 */
public class TestBean extends BViewModel   {
    private String name;

    public TestBean(String name) {
        this.name = name;
    }


    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR._all);
    }
}
