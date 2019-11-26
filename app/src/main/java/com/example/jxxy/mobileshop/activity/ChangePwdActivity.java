package com.example.jxxy.mobileshop.activity;

import android.widget.TextView;

import com.example.jxxy.mobileshop.common.BaseActivity;
import com.example.jxxy.mobileshop.R;

import butterknife.BindView;
import butterknife.OnClick;

//修改密码
public class ChangePwdActivity extends BaseActivity {

    @BindView(R.id.tv_title)
    TextView tvTitle;

    @Override
    public int getContentViewId(){
        return R.layout.activity_change_pwd;
    }

    @Override
    protected void initView(){
        super.initView();
        tvTitle.setText("修改密码");
    }

    @OnClick(R.id.iv_back)
    void close(){
        finish();
    }
}

