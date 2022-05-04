package com.example.android.week2appwb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button alertDialogButton = findViewById(R.id.alertDialogButton);
        alertDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new MyDialogFragment().show(getSupportFragmentManager(), MyDialogFragment.TAG);
            }
        });
    }
}