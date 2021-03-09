package com.example.sisteminformasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void move(View view) {
        Intent a = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(a);
    }

    public void move1(View view) {
        Intent a = new Intent(MainActivity2.this,MainActivity3.class);
        startActivity(a);
    }
}