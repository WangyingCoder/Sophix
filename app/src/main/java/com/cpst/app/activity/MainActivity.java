package com.cpst.app.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.cpst.app.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 本项目设计阿里热更新和下拉刷新模块案例
 * 仅供学习
 */
public class MainActivity extends AppCompatActivity {

    @Bind(R.id.back)
    Button back;
    @Bind(R.id.button)
    Button button;
    @Bind(R.id.click)
    Button mClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init();
    }

    private void init() {

    }

    @OnClick(R.id.back)
    public void onBackClicked() {
        finish();
    }

    @OnClick(R.id.button)
    public void onButtonClicked() {
        startActivity(new Intent(MainActivity.this, RefreshActivity.class));
    }


    @OnClick(R.id.click)
    public void onViewClicked() {
        startActivity(new Intent(MainActivity.this,FirstActivity.class));
    }
}
