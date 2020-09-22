package com.example.morning_evening;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class Evening extends AppCompatActivity {
    String EveningPrayers[] = {
            "رضيتُ باللهِ ربًّا وبالإسلامِ دينًا وبمحمَّدٍ صلَّى اللهُ عليه وسلَّم نبيًّا",
            "أمسَيْنا على فِطرةِ الإسلامِ وعلى كَلِمةِ الإخلاصِ وعلى دينِ نبيِّنا محمَّدٍ صلَّى اللهُ عليه وسلَّم وعلى مِلَّةِ أبينا إبراهيمَ حنيفًا مسلمًا وما كان مِنَ المشركينَ",
            "اللهم بكَ أمْسَينَا ، وبكَ أصبحنا ، وبكَ نحيا ، وبكَ نموتُ ، وإليكَ المصيرُ",
            "يا حيُّ يا قيومُ برحمتك أستغيثُ ، و أَصلِحْ لي شأني كلَّه ، و لا تَكِلْني إلى نفسي طرفَةَ عَينٍ أبدًا",
    };
    private Button extra;
    private TextView EveningPray;
    private Button Back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evening);
        extra = (Button)findViewById(R.id.btnNext);
        EveningPray = (TextView)findViewById(R.id.tvEvPr);
        Back = (Button)findViewById(R.id.button2);
        extra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomGen = new Random();
                int randomNumber = randomGen.nextInt(EveningPrayers.length);
                String Ev = EveningPrayers[randomNumber];
                EveningPray.setText(Ev);

            }
        });
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity5();
            }
        });
    }
    public void openActivity5() {
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }
}