package com.example.studydaggerbasic.dipattern.lesson_five_runtime_dependency;

import dagger.Component;

@Component(modules = RunModule.class)
public interface PrintMessageComponent {

    void inject(LessonFiveActivity lessonFiveActivity);
}
