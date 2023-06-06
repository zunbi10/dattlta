package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CourseIntroductionActivity extends AppCompatActivity {
    Button btnNext;
    public final static String NAME = "name";
    public final static String Subject = "subject";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_introduction);
        btnNext = findViewById(R.id.buttonNext);
        Intent intent1 = getIntent();
        TextView Text_intro = findViewById(R.id.text_intro);
        if(intent1.getStringExtra(Subject).equals("AI"))
        {
            Text_intro.setText(String.format("Chương trình cung cấp khóa học chất lượng cao về lĩnh vực Trí tuệ nhân tạo (AI)." +
                    " Thông qua khóa học, học viên có thể:\n\n\t* Tập trung vào xây dựng các năng lực trọng tâm trong tạo mẫu AI dựa" +
                    " trên nền tảng vững cjắc từ Toán học, bao gồm Đại số tuyến tính, Xác suất-Thống kê.\n\n\t* Giới thiệu trọn vẹn các " +
                    "nội dung liên quan tới các công cụ Học máy, NumPy tới Keras, và kỹ thuật chứa CNN cũng như các bài thực hành có " +
                    "tính thực thực tế cao.\n\n\t* Cung cấp hơn 80 giờ hoàn thiện dự án tốt nghiệp có tính thực tế, thao tác trực tiếp " +
                    "trên nguồn dữ liệu mã nguồn mở với chính AI do con người học tự xây dựng."));
        }
        else if(intent1.getStringExtra(Subject).equals("BD"))
        {
            Text_intro.setText(String.format("%s     %s",intent1.getStringExtra(NAME),intent1.getStringExtra(Subject)));
        }
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CourseIntroductionActivity.this, QuestionActivity.class);
                intent.putExtra(QuestionActivity.NAME, intent1.getStringExtra(NAME));
                startActivity(intent);
            }
        });

    }
}