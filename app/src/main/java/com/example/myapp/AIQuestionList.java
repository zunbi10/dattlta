package com.example.myapp;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class AIQuestionList extends ArrayList<Question> {
    public AIQuestionList() {
        Question q1 = new Question();
        q1.setQuestion("What is Software?");
        q1.setAnswer("Software is a set of programs and documentation");
        q1.setOption1("Software is documentation and configuration of data");
        q1.setOption2("Software is a set of programs");
        q1.setOption3("None of these");
        this.add(q1);

        Question q2 = new Question();
        q2.setQuestion("Project risk factor is considered in which model?");
        q2.setAnswer("Spiral model");
        q2.setOption1("Waterfall model");
        q2.setOption2("RM model");
        q2.setOption3("Prototyping model");
        this.add(q2);

        Question q3 = new Question();
        q3.setQuestion("Which of the following is true?");
        q3.setAnswer("Design – Solving problems");
        q3.setOption1("Analysis – Find out solutions");
        q3.setOption2("Analysis – How to do it");
        q3.setOption3("Design – Understanding problems");
        this.add(q3);

        Question q4 = new Question();
        q4.setQuestion("1+1=2?");
        q4.setAnswer("Sai");
        q4.setOption1("Đúng");
//        q4.setOption2(null);
//        q4.setOption3(null);
        this.add(q4);

        Question q5 = new Question();
        q5.setQuestion("Which of the following is true?");
        q5.setAnswer("Design – Solving problems");
        q5.setOption1("Analysis – Find out solutions");
        q5.setOption2("Analysis – How to do it");
        q5.setOption3("Design – Understanding problems");
        this.add(q5);

        Question q6 = new Question();
        q6.setQuestion("Trong các đáp án dưới đây,đâu là từ dành riêng(reserved words)được quy ước sẵn bởi ngôn ngữ lập trình C?");
        q6.setAnswer("main");
        q6.setOption1("the");
        q6.setOption2("double");
        q6.setOption3("funcion");
        this.add(q6);

        Question q7 = new Question();
        q7.setQuestion("có bao nhiêu cách sắp xếp thứ t khác nhau khi 4 người xếp thành một hàng dọc");
        q7.setAnswer("24");
        q7.setOption1("36");
        q7.setOption2("4");
        q7.setOption3("10");
        this.add(q7);

        Question q8 = new Question();
        q8.setQuestion("có 6 cách chọn ra 3 người từ một nhóm 5 người nếu giả sử không có thứ tự nào khi trọn");
        q8.setAnswer("Đúng");
        q8.setOption1("Sai");
        this.add(q8);

        Question q9 = new Question();
        q9.setQuestion("có 2 bóng đỏ và 8 quả bóng trắng trọng một túi.Lần lượt lấy ra hai quả bóng cho tới khi không còn bóng trong túi\n"+
                "hỏi xác xuất để cả quả bóng được lấy ra đều là màu đỏ bằng 1/35");
        q9.setAnswer("Đúng");
        q9.setOption1("Sai");
        this.add(q9);

        Question q10 = new Question();
        q10.setQuestion("Tính tích vô hướng của 2 vecto có tọa độ như sau(1.0.3.4) và(2.9.1.0)?");
        q10.setAnswer("5");
        q10.setOption1("3");
        q10.setOption2("20");
        q10.setOption3("0");
        this.add(q10);
    }
    public void shuffle()
    {
        Collections.shuffle(this);
        for(Question q:this){
            System.out.println(q);
        }
    }

}

