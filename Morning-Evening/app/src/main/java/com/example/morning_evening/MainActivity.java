package com.example.morning_evening;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
        private Button Morning;
        private Button Evening;
        private Button ToCounter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Morning = (Button)findViewById(R.id.btnMorning);
        ToCounter = (Button)findViewById(R.id.BtnCounters);
        Evening = (Button)findViewById(R.id.btnEvening);
        Morning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
        Evening.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();
            }
        });
        ToCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();
            }
        });
    }
    public void openActivity2() {
        Intent intent = new Intent(this, Morning.class);
        startActivity(intent);
    }
    public void openActivity3() {
        Intent intent2 = new Intent(this, Evening.class);
        startActivity(intent2);
    }
    public void openActivity() {
        Intent intent2 = new Intent(this, Counter.class);
        startActivity(intent2);
    }

}