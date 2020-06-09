package com.example.studydaggerbasic.dipattern.lesson_four_binds;

import javax.inject.Inject;

public class FakeConnection implements Connection {

    @Inject
    public FakeConnection(){}

    @Override
    public String doRequest() {
        return "Fake Connection";
    }
}
