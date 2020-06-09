package com.example.studydaggerbasic.dipattern.lesson_seven_named_param;

import android.os.Bundle;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.studydaggerbasic.R;

import javax.inject.Inject;



public class LessonSevenActivity extends AppCompatActivity {

    @Inject
    public Login login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_seven);
        DaggerLoginComponent.builder().setUserName("TungLT ").setPassword("123456").build().inject(this);
        showToast(login.getUserInfo());
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
