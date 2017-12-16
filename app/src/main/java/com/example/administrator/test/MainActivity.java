package com.example.administrator.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;


/**
 * 打印1-200之间的所有素数
 */

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 1; i <= 200; i++) {
            boolean b = true;// 默认为素数
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    b = false;// 只要有一个被整除，则是非素数
                    break;
                }
            }
            if (b) {// 素数，打印结果
                Log.d(TAG, "onCreate: i = " + i);
            }
        }


    }

}