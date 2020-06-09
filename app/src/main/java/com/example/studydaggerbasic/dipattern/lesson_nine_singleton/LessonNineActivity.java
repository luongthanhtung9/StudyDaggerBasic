package com.example.studydaggerbasic.dipattern.lesson_nine_singleton;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import com.example.studydaggerbasic.R;

import javax.inject.Inject;




public class LessonNineActivity extends AppCompatActivity {

    @Inject
    public College college1,college2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_nine);

        DaggerCollegeComponent.create().inject(this);
        college1.getInstance();
        college2.getInstance();
    }
}
