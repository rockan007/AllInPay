package com.build.an;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.build.an.allinpay.JARActivity;

import com.build.an.weixin.PayActivity;
import com.build.an.weixin.wxapi.WXEntryActivity;
import com.build.an.zhifubao.PayDemoActivity;

/**
 * 选择支付方式
 * Created by admin on 2016/7/27.
 */
public class ChosePayWayActivity extends AppCompatActivity {
    Intent mIntent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_way);
        mIntent=new Intent();
    }

    /**
     * 选择微信支付
     */
    public void wePay(View v){
        mIntent.setClass(this, PayActivity.class);
        startActivity(mIntent);
    }
    /**
     * 选择支付宝支付
     */
   public void zhiFuPay(View view){
        mIntent.setClass(this, PayDemoActivity.class);
        startActivity(mIntent);
    }

    /**
     * 选择银联支付
     */
    public void yinLianPay(View view){
        mIntent.setClass(this, JARActivity.class);
        startActivity(mIntent);
    }
}
