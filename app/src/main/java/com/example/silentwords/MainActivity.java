package com.example.silentwords;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button start,exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = findViewById(R.id.btn1);
        exit = findViewById(R.id.btn2);
        start.setOnClickListener(v -> {
            Intent i=new Intent(MainActivity.this, MainActivity2.class);
            startActivity(i);
        });
        exit.setOnClickListener(v -> finishAffinity());
    }
}