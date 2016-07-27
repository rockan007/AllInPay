package com.build.an;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


/**
 * 商品购买界面
 * Created by admin on 2016/7/27.
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void toChoseWay(View v){
        Intent intent=new Intent(this,ChosePayWayActivity.class);
        startActivity(intent);
    }
}
