package com.example.silentwords;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        back = findViewById(R.id.btn5);
        back.setOnClickListener(v -> {
            Intent i=new Intent(MainActivity5.this, MainActivity2.class);
            startActivity(i);
        });
    }
}