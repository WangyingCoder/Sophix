package com.cpst.app.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.cpst.app.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by wy on 2017/8/9.
 *
 */

public class FirstActivity extends Activity {
    @Bind(R.id.btn_test)
    Button mBtnTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        ButterKnife.bind(this);
        init();
        test();
    }

    private void test() {
        Toast.makeText(this, "你好！", Toast.LENGTH_LONG).show();
    }

    private void init() {
//          int  i = 0 /0;
//         Log.i("TAG",""+ i);
        Toast.makeText(this, "恭喜！", Toast.LENGTH_LONG).show();
    }


    @OnClick(R.id.btn_test)
    public void onViewClicked() {
        Toast.makeText(this, "点击事件！", Toast.LENGTH_LONG).show();
    }
}
