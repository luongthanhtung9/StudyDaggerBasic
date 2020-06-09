package com.example.studydaggerbasic.dipattern.lesson_five_runtime_dependency;

import android.os.Bundle;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.studydaggerbasic.R;

import javax.inject.Inject;


public class LessonFiveActivity extends AppCompatActivity {

    @Inject
    public PrintMessage printMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lession_five);
        DaggerPrintMessageComponent.builder().runModule(new RunModule("Give My message to print ..")).build().inject(this);
        showToast(printMessage.printMessage());
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
