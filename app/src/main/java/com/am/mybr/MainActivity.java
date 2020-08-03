package com.am.mybr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startt(View view) {
        ContextCompat.startForegroundService(MainActivity.this,new Intent(MainActivity.this,ForegroundService.class));
    }

    public void stop(View view) {
        stopService(new Intent(MainActivity.this,ForegroundService.class));

    }
}