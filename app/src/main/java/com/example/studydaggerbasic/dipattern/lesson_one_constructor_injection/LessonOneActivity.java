package com.example.studydaggerbasic.dipattern.lesson_one_constructor_injection;

import android.os.Bundle;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.studydaggerbasic.R;


public class LessonOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_one);
        // Getting car instance here
        Car car = DaggerCarComponent.create().getCar();
        showToast(car.run());
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
