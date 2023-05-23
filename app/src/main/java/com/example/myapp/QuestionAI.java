package com.example.myapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuestionAI extends AppCompatActivity implements View.OnClickListener {
    public static String NAME = "";
    TextView totalQuestionsTextView;
    TextView questionTextView;
    Button btn_a1, btn_a2, btn_a3, btn_a4;
    Button submitBtn;
    int maxSize=5;
    String selectedAnswer, rightAnswer;
    int questionIndex = 0;
    int total=1;
    public static int score = 0;
    public static AIQuestionList questions = new AIQuestionList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_ai);

        init();
        shuffleQuestion();
        loadQuestions(questionIndex);
//        TextView textUserName = findViewById(R.id.Name_total_question);
//        Intent intent = getIntent();
//        textUserName.setText(String.format("chào %s câu hỏi hiện tại là %d/%d",intent.getStringExtra(NAME) ,total, questions.size()));
    }
    public void init(){
        totalQuestionsTextView = findViewById(R.id.Name_total_question);
        questionTextView= findViewById(R.id.textViewQuestion);
        btn_a1= findViewById(R.id.buttonAnsA);
        btn_a2= findViewById(R.id.buttonAnsB);
        btn_a3= findViewById(R.id.buttonAnsC);
        btn_a4= findViewById(R.id.buttonAnsD);
        submitBtn= findViewById(R.id.buttonSubmit);

        btn_a1.setOnClickListener(this);
        btn_a2.setOnClickListener(this);
        btn_a3.setOnClickListener(this);
        btn_a4.setOnClickListener(this);
        submitBtn.setOnClickListener(this);
    }
    public void loadQuestions(int index){
        total_question();
        Question question = questions.get(index);
        rightAnswer = question.getAnswer();
        questionTextView.setText(question.getQuestion());
        if(question.getOption2()==null||question.getOption3()==null)
        {
            btn_a1.setVisibility(View.INVISIBLE);
            btn_a2.setText(question.getOption1());
            btn_a3.setText(question.getAnswer());
            btn_a4.setVisibility(View.INVISIBLE);
        }
        else
        {
            btn_a1.setVisibility(View.VISIBLE);
            btn_a4.setVisibility(View.VISIBLE);
            btn_a1.setText(question.getAnswer());
            btn_a2.setText(question.getOption1());
            btn_a3.setText(question.getOption2());
            btn_a4.setText(question.getOption3());
        }
    }

    @Override
    public void onClick(View view) {
        Button clickedButton = (Button) view;
        btn_a1.setBackgroundColor(Color.WHITE);
        btn_a2.setBackgroundColor(Color.WHITE);
        btn_a3.setBackgroundColor(Color.WHITE);
        btn_a4.setBackgroundColor(Color.WHITE);

        if (clickedButton.getId() == R.id.buttonSubmit){
            if (selectedAnswer == rightAnswer){
                score++;
            }
            questionIndex++;
            total++;
            if (questionIndex >= maxSize){
                finishQuiz();
            }
            else {
                loadQuestions(questionIndex);
            }
        }
        else {
            clickedButton.setBackgroundColor(Color.GREEN);
            selectedAnswer = clickedButton.getText().toString().trim();
        }
    }
    public void finishQuiz(){
        new AlertDialog.Builder(this)
                .setTitle("FinishQuiz")
                .setMessage(String.format("Score: %d (Correct Answers: %d/%d)", score,score,maxSize))
                .setPositiveButton("Restar", ((dialogInterface, i) -> restartQuiz()))
                .setNegativeButton("Review", ((dialogInterface, i) -> reviewQuiz()))
                .show();
    }

    public void restartQuiz(){
        score = 0;
        questionIndex = 0;
        total=1;
        shuffleQuestion();
        loadQuestions(questionIndex);
    }

    public void reviewQuiz(){

    }
    public void total_question()
    {
        TextView textUserName = findViewById(R.id.Name_total_question);
        Intent intent = getIntent();
        textUserName.setText(String.format("chào %s  câu hỏi hiện tại là %d/%d",intent.getStringExtra(NAME) ,total, maxSize));
    }
    public void shuffleQuestion()
    {
        questions.shuffle();
    }

}

