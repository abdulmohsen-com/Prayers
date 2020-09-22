package com.example.morning_evening;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Morning extends AppCompatActivity {
    String MorningPrayers[] = {
            "أَصبَحْنا على فِطرةِ الإسلامِ، وكَلِمةِ الإخلاصِ، ودِينِ نَبيِّنا محمَّدٍ صلَّى اللهُ عليه وسلَّمَ، ومِلَّةِ أبِينا إبراهيمَ، حَنيفًا مُسلِمًا، وما كان مِنَ المُشرِكينَ",
            "رضيتُ باللهِ ربًّا وبالإسلامِ دينًا وبمحمَّدٍ صلَّى اللهُ عليه وسلَّم نبيًّا",
            "لا إلهَ إلَّا اللهُ وحدَه لا شريك له له المُلكُ وله الحمدُ وهو على كلِّ شيءٍ قديرٌ",
            "اللهمَّ إني أسألُك علمًا نافعًا ورزقًا طيبًا وعملًا متقبلًا",
    };
    private Button Next;
     private TextView MorPr;
     private Button Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morning);
        Next = (Button)findViewById(R.id.button);
        MorPr = (TextView)findViewById(R.id.tvMorPr);
        Back = (Button)findViewById(R.id.button3);
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomGen = new Random();
                int randomNumber = randomGen.nextInt(MorningPrayers.length);
                String Ev = MorningPrayers[randomNumber];
                MorPr.setText(Ev);

            }
        });
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity4();
            }
        });
    }
    public void openActivity4() {
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }
}