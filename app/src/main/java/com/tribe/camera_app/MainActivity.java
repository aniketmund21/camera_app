package com.tribe.camera_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tribe.camera_app.Utils.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Utils.blackIconStatusBar(MainActivity.this, R.color.background_light);
    }
}