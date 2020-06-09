package com.example.studydaggerbasic.dipattern.lesson_eight_method_injection;

import dagger.Component;

@Component
public interface TvComponent {
     Television getTelevision();
}
