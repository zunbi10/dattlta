package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class QuestionAI1 extends AppCompatActivity {
    public static String NAME = "";
    Button btn_q1, btn_q2, btn_q3, btn_q4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_ai1);

        init();

        TextView textView1 = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView4);
        Intent intent = getIntent();
        textView1.setText("Chào " + intent.getStringExtra(NAME));

        RadioGroup group = findViewById(R.id.radioGroup);
        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedRadioId) {
                switch (checkedRadioId){
                    case R.id.button_AI_q1_a1:
                        textView2.setText("Bạn chọn đáp án A");
                        break;
                    case R.id.button_AI_q1_a2:
                        textView2.setText("Bạn chọn đáp án B");
                        break;
                    case R.id.button_AI_q1_a3:
                        textView2.setText("Bạn chọn đáp án C");
                        break;
                    case R.id.button_AI_q1_a4:
                        textView2.setText("Bạn chọn đáp án D");
                        break;
                }
            }
        });
    }
    void init(){
        btn_q1 = findViewById(R.id.button_AI_q1_a1);
        btn_q2 = findViewById(R.id.button_AI_q1_a2);
        btn_q3 = findViewById(R.id.button_AI_q1_a3);
        btn_q4 = findViewById(R.id.button_AI_q1_a4);
    }
//        btn_q1= findViewById(R.id.button_AI_q1_a1);
//        btn_q2= findViewById(R.id.button_AI_q1_a2);
//        btn_q3= findViewById(R.id.button_AI_q1_a3);
//        btn_q4= findViewById(R.id.button_AI_q1_a4);

//        btn_q1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(QuestionAI1.this, QuestionAI2.class);
//                startActivity(intent);
//            }
//        });
//        btn_q2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(QuestionAI1.this, QuestionAI2.class);
//                startActivity(intent);
//            }
//        });
//        btn_q3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(QuestionAI1.this, QuestionAI2.class);
//                startActivity(intent);
//            }
//        });
//        btn_q4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(QuestionAI1.this, QuestionAI2.class);
//                startActivity(intent);
//            }
//        });
}