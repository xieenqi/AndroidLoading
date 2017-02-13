package com.android.loading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android.loading.widget.LoadingLayout;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private LoadingLayout ll_lading;
    private Button bt_no_network, bt_erro, bt_empty, bt_customer, bt_reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll_lading = (LoadingLayout) findViewById(R.id.ll_lading);
        bt_no_network = (Button) findViewById(R.id.bt_no_network);
        bt_erro = (Button) findViewById(R.id.bt_erro);
        bt_empty = (Button) findViewById(R.id.bt_empty);
        bt_customer = (Button) findViewById(R.id.bt_customer);
        bt_reset = (Button) findViewById(R.id.bt_reset);
        bt_no_network.setOnClickListener(this);
        bt_erro.setOnClickListener(this);
        bt_empty.setOnClickListener(this);
        bt_customer.setOnClickListener(this);
        bt_reset.setOnClickListener(this);
        ll_lading.setStatus(LoadingLayout.Loading);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_no_network:
                ll_lading.setStatus(LoadingLayout.No_Network);
                break;
            case R.id.bt_erro:
                ll_lading.setStatus(LoadingLayout.Error);
                break;
            case R.id.bt_empty:
                ll_lading.setStatus(LoadingLayout.Empty);
                break;
            case R.id.bt_customer:
                LoadingLayout.getConfig()
                        .setErrorText("customer出错啦~请稍后重试！")
                        .setEmptyText("customer暂无数据!")
                        .setNoNetworkText("customer网络不给力!")
//                .setErrorImage(R.drawable.define_error)
                        .setEmptyImage(R.mipmap.define_empty)
                        .setNoNetworkImage(R.mipmap.define_nonetwork)
                        .setAllTipTextColor(R.color.colorAccent)
                        .setAllTipTextSize(20)
                        .setReloadButtonText("customer重试")
                        .setReloadButtonTextColor(R.color.colorPrimaryDark)
                        .setReloadButtonBackgroundResource(R.drawable.retage_bule)
                        .setReloadButtonTextSize(20);
                break;
            case R.id.bt_reset:
                ll_lading.setStatus(LoadingLayout.Loading);
                break;
        }
    }
}
