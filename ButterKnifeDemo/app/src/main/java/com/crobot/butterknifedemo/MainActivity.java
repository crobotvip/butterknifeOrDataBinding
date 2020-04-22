package com.crobot.butterknifedemo;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.crobot.butterknifedemo.databinding.ActivityMainBinding;
import com.crobot.uilib.base.ImageBean;
import com.crobot.uilib.base.custom.TestBean;
import com.crobot.uilib.databinding.ViewImageCellBinding;
import com.crobot.uilib.view.AbstructModelLinearLayout;
import com.crobot.uilib.view.CEditView;
import com.crobot.uilib.view.CellView;


public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        CEditView.CellViewModel cellViewModel=new CEditView.CellViewModel(",","");
        activityMainBinding.cEditView.setData(cellViewModel);


        CellView.CellViewModel cellView=new CellView.CellViewModel("hdfajfadfa","fasjdfajkfjl");
        activityMainBinding.cellView.setData(cellView);
        ImageBean imageBean=new ImageBean();
        imageBean.setTitle("xxxxxxxxxxxxx");
        activityMainBinding.bkICV.setData(imageBean);


        AbstructModelLinearLayout<TestBean> abstructCellView =new AbstructModelLinearLayout<TestBean>(getBaseContext()) {

            private ViewImageCellBinding viewImageCellBinding;

            @Override
            public void setData(TestBean testBean) {
                viewImageCellBinding.setMData(testBean);

            }

            @Override
            public boolean userDataBinding() {
                return true;
            }

            @Override
            public void initData() {
                viewImageCellBinding = (ViewImageCellBinding) viewDataBinding;

            }

            @Override
            public int getLayoutId() {
                return R.layout.view_image_cell;
            }
        };
        TestBean testBean=new TestBean("sfjakjflafjlajdkf");

        abstructCellView.setData(testBean);
        abstructCellView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str =testBean.getName()+"#####";
                testBean.setName(str);
            }
        });
        activityMainBinding.llContent.addView(abstructCellView);






    }
}
