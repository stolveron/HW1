package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivitySecond extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button buttonBack = (Button) findViewById(R.id.buttonBack);
        Button buttonNext = (Button) findViewById(R.id.buttonNext);

        View.OnClickListener goToMainActivity = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivitySecond.this, MainActivity.class);
                startActivity(intent);
            }
        };

        buttonBack.setOnClickListener(goToMainActivity);

        View.OnClickListener goToThirdActivity = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivitySecond.this, MainActivityThird.class);
                startActivity(intent);
            }
        };

        buttonNext.setOnClickListener(goToThirdActivity);

    }
}