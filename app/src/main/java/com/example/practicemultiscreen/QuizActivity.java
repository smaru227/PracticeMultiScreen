package com.example.practicemultiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {
    TextView textView;
    Button yes,no;
    int index,score;
    final static String RESULT = "com.example.practicemultiscreen.RESULT_SCORE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        final String [] question = {"Is Java a person?","Was Java Developed in 1833?","Java uses C++?","Java has Class.","Java supports interface."};
        final Boolean [] answer = {false,false,false,true,true};

        index = 0;
        score = 0;

        final Intent intent = new Intent(this,ResultActivity.class);
        textView = findViewById(R.id.textView2);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);

        textView.setText(question[index]);
        yes.setOnClickListener(v -> {
            if(answer[index]){
                score++;
            }
            index++;
            if(index == 5){
                intent.putExtra(RESULT,score);
                startActivity(intent);
            }
            textView.setText(question[index]);
        });
        no.setOnClickListener(v -> {
            if(!answer[index]){
                score++;
            }
            index++;
            if(index == 5){
                intent.putExtra(RESULT,score);
                startActivity(intent);
            }
            textView.setText(question[index]);
        });
    }
}