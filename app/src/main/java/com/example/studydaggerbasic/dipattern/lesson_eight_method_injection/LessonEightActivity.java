package com.example.studydaggerbasic.dipattern.lesson_eight_method_injection;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import com.example.studydaggerbasic.R;

import javax.inject.Inject;



public class LessonEightActivity extends AppCompatActivity {
    @Inject Television television;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lession_eight);
        television=DaggerTvComponent.create().getTelevision();

    }

}
