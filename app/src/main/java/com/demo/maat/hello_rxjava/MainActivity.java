package com.demo.maat.hello_rxjava;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    /**
     通过使用 @BindView 来消除 findViewById
     将多个 View 组织到一个列表中，一次性操作它们
     通过使用 @onClick 为 View 绑定监听，消除 listener 的匿名内部类
     通过使用资源注解如 @BindColor，来消除资源的查找
     @Nullable 参数可为NULL

     */

    // 声明注解
    @Nullable
    @BindView(R.id.btn_rxjava) Button mBtnRxjava;

    // 写法也可以类似下面
    @BindView(R.id.btn_retrofit)
    Button mBtnRetrofit;

    @BindView(R.id.btn_rxandroid) Button mBtnRxAndroid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 进行绑定
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_rxjava, R.id.btn_retrofit, R.id.btn_rxandroid})

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_rxjava:
                Intent intent = new Intent(this, RxJavaMainActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_retrofit:
                Intent retrofit = new Intent(this, RxJavaRetrofitActivity.class);
                startActivity(retrofit);
                break;
            case R.id.btn_rxandroid:
                Intent rxandroid = new Intent(this, RxAndroidActivity.class);
                startActivity(rxandroid);
                break;
        }
    }
}
