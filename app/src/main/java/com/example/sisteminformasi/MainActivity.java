package com.example.sisteminformasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void move(View view) {
        Intent a = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(a);
    }

    public void move1(View view) {
        Intent a = new Intent(MainActivity.this,MainActivity3.class);
        startActivity(a);
    }
}