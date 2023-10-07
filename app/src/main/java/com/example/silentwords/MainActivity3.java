package com.example.silentwords;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        back = findViewById(R.id.btn3);
        back.setOnClickListener(v -> {
            Intent i= new Intent(MainActivity3.this, MainActivity2.class);
            startActivity(i);
        });
    }
}