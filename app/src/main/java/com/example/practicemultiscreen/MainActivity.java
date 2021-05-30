package com.example.practicemultiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnyes,btnno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent intent = new Intent(this,QuizActivity.class);
        btnyes = findViewById(R.id.btnYes);
        btnno = findViewById(R.id.btnNo);

        btnyes.setOnClickListener(v -> startActivity(intent));
        btnno.setOnClickListener(v -> Toast.makeText(MainActivity.this, "Click Yes to start Quiz", Toast.LENGTH_SHORT).show());
    }
}