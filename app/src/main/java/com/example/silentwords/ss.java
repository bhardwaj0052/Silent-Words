package com.example.silentwords;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class ss extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ss);
        new Handler().postDelayed(() -> {
            Intent i =new Intent(ss.this, MainActivity.class);
            startActivity(i);
            finish();
        },2000);
    }
}