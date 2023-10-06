package com.example.silentwords;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    Button love,one,heart,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        love = findViewById(R.id.l1);
        one = findViewById(R.id.o1);
        heart = findViewById(R.id.h1);
        back = findViewById(R.id.g1);
        love.setOnClickListener(v -> {
            Intent i=new Intent(MainActivity2.this, MainActivity3.class);
            startActivity(i);
        });
        one.setOnClickListener(v -> {
            Intent r=new Intent(MainActivity2.this, MainActivity4.class);
            startActivity(r);
        });
        heart.setOnClickListener(v -> {
            Intent h=new Intent(MainActivity2.this, MainActivity5.class);
            startActivity(h);
        });
        back.setOnClickListener(v -> {
            Intent g=new Intent(MainActivity2.this, MainActivity.class);
            startActivity(g);
        });
    }
}