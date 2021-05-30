package com.example.practicemultiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {
    TextView textView;
    Button yes,no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        textView = findViewById(R.id.textView3);
        yes = findViewById(R.id.btnyes);
        no = findViewById(R.id.btnno);

        Intent intent = getIntent();
        int score = intent.getIntExtra(QuizActivity.RESULT,0);
        textView.setText("Your score is " + score);


        yes.setOnClickListener(v -> {
            Intent intent1 = new Intent(ResultActivity.this,MainActivity.class);
            startActivity(intent1);
        });
        no.setOnClickListener(v -> finishAffinity());
    }
}