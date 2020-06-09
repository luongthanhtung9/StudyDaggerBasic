package com.example.studydaggerbasic.dipattern.lesson_six_component_builder_for_runtime_parameters;

import android.os.Bundle;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.studydaggerbasic.R;

import javax.inject.Inject;



public class LessonSixActivity extends AppCompatActivity {

    @Inject
    public Run run;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_six);
        DaggerRunComponent.builder().setRunner("DaggerRunComponet is running").build().inject(this);
        showToast(run.whoIsRunning());
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
