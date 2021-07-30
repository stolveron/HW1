package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSecond = (Button) findViewById(R.id.btnSecond);
        checkBox = (CheckBox) findViewById(R.id.checkBox);
        View.OnClickListener goToSecondActivity = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivitySecond.class);
                startActivity(intent);
            }
        };

        btnSecond.setOnClickListener(goToSecondActivity);

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox.isChecked()){
                    Toast.makeText(getApplicationContext(), "Well done", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}