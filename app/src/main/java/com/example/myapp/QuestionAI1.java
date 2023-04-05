package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuestionAI1 extends AppCompatActivity {
Button btn_q1, btn_q2, btn_q3, btn_q4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_ai1);
        btn_q1= findViewById(R.id.button_AI_q1_a1);
        btn_q2= findViewById(R.id.button_AI_q1_a2);
        btn_q3= findViewById(R.id.button_AI_q1_a3);
        btn_q4= findViewById(R.id.button_AI_q1_a4);
                btn_q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuestionAI1.this, QuestionAI2.class);
                startActivity(intent);
            }
        });
        btn_q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuestionAI1.this, QuestionAI2.class);
                startActivity(intent);
            }
        });
        btn_q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuestionAI1.this, QuestionAI2.class);
                startActivity(intent);
            }
        });
        btn_q4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuestionAI1.this, QuestionAI2.class);
                startActivity(intent);
            }
        });
    }
}