package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button btnAI,btnBD;
boolean isFirst = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText textName = findViewById(R.id.textName);
        btnAI = findViewById(R.id.buttonAI);


        btnAI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = textName.getText().toString().trim();
                Intent intent = new Intent(MainActivity.this, QuestionAI.class);
                intent.putExtra(QuestionAI.NAME, name);
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
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, QuestionAI.class);
                startActivity(intent);
            };
}