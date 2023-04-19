package com.example.myapp;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class AIQuestionList extends ArrayList<AIQuestion> {
    public AIQuestionList() {
        AIQuestion q1 = new AIQuestion();
        q1.setQuestion("What is Software?");
        q1.setAnswer("Software is a set of programs and documentation");
        q1.setOption1("Software is documentation and configuration of data");
        q1.setOption2("Software is a set of programs");
        q1.setOption3("None of these");
        this.add(q1);

        AIQuestion q2 = new AIQuestion();
        q2.setQuestion("Project risk factor is considered in which model?");
        q2.setAnswer("Spiral model");
        q2.setOption1("Waterfall model");
        q2.setOption2("RM model");
        q2.setOption3("Prototyping model");
        this.add(q2);

        AIQuestion q3 = new AIQuestion();
        q3.setQuestion("Which of the following is true?");
        q3.setAnswer("Design – Solving problems");
        q3.setOption1("Analysis – Find out solutions");
        q3.setOption2("Analysis – How to do it");
        q3.setOption3("Design – Understanding problems");
        this.add(q3);

        AIQuestion q4 = new AIQuestion();
        q4.setQuestion("1+1=2?");
        q4.setAnswer("Sai");
        q4.setOption1("Đúng");
        q4.setOption2(null);
        q4.setOption3(null);
        this.add(q4);

        AIQuestion q5 = new AIQuestion();
        q5.setQuestion("Which of the following is true?");
        q5.setAnswer("Design – Solving problems");
        q5.setOption1("Analysis – Find out solutions");
        q5.setOption2("Analysis – How to do it");
        q5.setOption3("Design – Understanding problems");
        this.add(q5);
    }
}

