package com.example.studydaggerbasic.dipattern.lesson_four_binds;

import android.os.Bundle;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.studydaggerbasic.R;

import javax.inject.Inject;


public class LessonFourActivity extends AppCompatActivity {

    @Inject
    Connection connection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_four);
        DaggerConnectionComponent.create().inject(this);
        showToast(connection.doRequest());
    }
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
