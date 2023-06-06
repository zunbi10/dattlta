package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnAI,btnBD;
    boolean isFirst = true;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText textName = findViewById(R.id.textName);
        btnAI = findViewById(R.id.buttonAI);
        btnBD = findViewById(R.id.buttonBD);

        btnAI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = textName.getText().toString().trim();
                String subject = "AI";
                Intent intent = new Intent(MainActivity.this, CourseIntroductionActivity.class);
                intent.putExtra(CourseIntroductionActivity.NAME, name);
                intent.putExtra(CourseIntroductionActivity.Subject, subject);
                startActivity(intent);
            }
        });

        btnBD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = textName.getText().toString().trim();
                String subject = "BD";
                Intent intent = new Intent(MainActivity.this, CourseIntroductionActivity.class);
                intent.putExtra(CourseIntroductionActivity.NAME, name);
                intent.putExtra(CourseIntroductionActivity.Subject, subject);
                startActivity(intent);
            }
        });


        textName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textName.setText("");
            }
        });


        textName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (isFirst) {
                    textName.setText("");
                    isFirst = false;
                }
            }
        });
    }

}