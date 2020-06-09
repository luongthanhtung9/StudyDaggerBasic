package com.example.studydaggerbasic.dipattern.lesson_two_constructor_injection_with_module;

import android.os.Bundle;

import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.studydaggerbasic.R;

import javax.inject.Inject;

public class LessonTwoActivity extends AppCompatActivity {

    // Want to inject ticket which is not local or it is not accessible for modification or some 3rd party
    @Inject
    TicketRepository ticketRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_two);

        // Initializing the ticket obj
        DaggerTicketComponent.create().inject(this);
        showToast(ticketRepository.getTickets());
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
