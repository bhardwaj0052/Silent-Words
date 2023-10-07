package com.example.silentwords;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        back = findViewById(R.id.btn4);
        back.setOnClickListener(v -> {
            Intent i =new Intent(MainActivity4.this, MainActivity2.class);
            startActivity(i);
        });
    }
}