package com.example.studydaggerbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.studydaggerbasic.dipattern.facade_pattern.FacadePatternActivity;
import com.example.studydaggerbasic.dipattern.lesson_eight_method_injection.LessonEightActivity;
import com.example.studydaggerbasic.dipattern.lesson_five_runtime_dependency.LessonFiveActivity;
import com.example.studydaggerbasic.dipattern.lesson_four_binds.LessonFourActivity;
import com.example.studydaggerbasic.dipattern.lesson_nine_singleton.LessonNineActivity;
import com.example.studydaggerbasic.dipattern.lesson_one_constructor_injection.LessonOneActivity;
import com.example.studydaggerbasic.dipattern.lesson_seven_named_param.LessonSevenActivity;
import com.example.studydaggerbasic.dipattern.lesson_six_component_builder_for_runtime_parameters.LessonSixActivity;
import com.example.studydaggerbasic.dipattern.lesson_three_field_injection.LessonThreeActivity;
import com.example.studydaggerbasic.dipattern.lesson_two_constructor_injection_with_module.LessonTwoActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int arrId[] = {R.id.btnConstructionInjection,
            R.id.btnConstructionInjectionWithModule, R.id.btnFieldInjection,
            R.id.btnBindInjection, R.id.btnRuntimeInjection, R.id.btnRuntimeInjection, R.id.btnRuntimeComponentInjection,
            R.id.btnNamedInjection, R.id.btnMethodInjection, R.id.btnSingleton, R.id.btnFacade};

    Button arrButton[] = new Button[11];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i = 0; i < 11; i++) {
            arrButton[i] = findViewById(arrId[i]);
            arrButton[i].setOnClickListener(this);
        }
		//add comment
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnConstructionInjection:
                startActivity(new Intent(this, LessonOneActivity.class));
                break;
            case R.id.btnConstructionInjectionWithModule:
                startActivity(new Intent(this, LessonTwoActivity.class));
                break;
            case R.id.btnFieldInjection:
                startActivity(new Intent(this, LessonThreeActivity.class));
                break;
            case R.id.btnBindInjection:
                startActivity(new Intent(this, LessonFourActivity.class));
                break;
            case R.id.btnRuntimeInjection:
                startActivity(new Intent(this, LessonFiveActivity.class));
                break;
            case R.id.btnRuntimeComponentInjection:
                startActivity(new Intent(this, LessonSixActivity.class));
                break;
            case R.id.btnNamedInjection:
                startActivity(new Intent(this, LessonSevenActivity.class));
                break;
            case R.id.btnMethodInjection:
                startActivity(new Intent(this, LessonEightActivity.class));
                break;
            case R.id.btnSingleton:
                startActivity(new Intent(this, LessonNineActivity.class));
                break;
            case R.id.btnFacade:
                startActivity(new Intent(this, FacadePatternActivity.class));
                break;
        }

    }

}