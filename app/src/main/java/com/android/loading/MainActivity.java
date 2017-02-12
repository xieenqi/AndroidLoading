package com.android.loading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.loading.widget.LoadingLayout;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.ll_lading)
    LoadingLayout ll_lading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll_lading.setStatus(LoadingLayout.Loading);
    }
}
