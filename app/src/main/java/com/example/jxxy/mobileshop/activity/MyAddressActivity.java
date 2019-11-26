package com.example.jxxy.mobileshop.activity;

import android.widget.TextView;

import com.example.jxxy.mobileshop.common.BaseActivity;
import com.example.jxxy.mobileshop.R;

import butterknife.BindView;
import butterknife.OnClick;
//我的地址活动操作页
public class MyAddressActivity extends BaseActivity {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @Override
    public int getContentViewId(){
        return R.layout.activity_my_address;
    }
    @Override
    protected void initView(){
        super.initView();
        tvTitle.setText("我的地址");
    }
    @OnClick(R.id.iv_back)
    void close(){
        finish();
    }
}
