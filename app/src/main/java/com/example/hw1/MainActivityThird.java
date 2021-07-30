package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityThird extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_third);
        Button buttonBackTwo = (Button) findViewById(R.id.buttonBackTwo);

        View.OnClickListener goToSecondActivity = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityThird.this, ActivitySecond.class);
                startActivity(intent);
            }
        };

        buttonBackTwo.setOnClickListener(goToSecondActivity);
    }
}