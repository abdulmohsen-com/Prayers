package com.example.morning_evening;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class Counter extends AppCompatActivity {
    String Prayers[] = {
            " لاحول و لا قوّة إلاّ بالله",
            "لا اله الا الله",
            "الله اكبر",
            "اسغفر الله",
    };
      private Button Back;
      private TextView Counter;
      private TextView Prayer;
      private Button Count;
      private Button Next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        Back = (Button)findViewById(R.id.btnBack);
        Count = (Button)findViewById(R.id.btnadd);
        Next = (Button)findViewById(R.id.btnThen);
        Counter = (TextView)findViewById(R.id.tvCounter);
        Prayer = (TextView)findViewById(R.id.tvPrayer);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomGen = new Random();
                int randomNumber = randomGen.nextInt(Prayers.length);
                String Ev = Prayers[randomNumber];
                Prayer.setText(Ev);
                Counter.setText("0");
            }
        });
        Count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int add = Integer.parseInt(Counter.getText().toString());
               int sum = add + 1;
               Counter.setText(sum + "");
            }
        });
    }
    public void openActivity2() {
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }
}