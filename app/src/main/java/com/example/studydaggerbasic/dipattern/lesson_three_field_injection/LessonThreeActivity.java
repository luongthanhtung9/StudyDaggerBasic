package com.example.studydaggerbasic.dipattern.lesson_three_field_injection;

import android.os.Bundle;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.studydaggerbasic.R;

import javax.inject.Inject;



public class LessonThreeActivity extends AppCompatActivity {

    //Field which we want to inject
    @Inject
    Message message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_three);
        // Getting Message dependency created
        DaggerMessageComponent.create().inject(this);
        showToast(message.getMessage());
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
