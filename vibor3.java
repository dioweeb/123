package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import static com.example.project.MainActivity.intent;
import static com.example.project.Situation.destination;
import static com.example.project.Story.callSituation;
import static com.example.project.Varianti.w;
import static com.example.project.MainActivity.number;
import static com.example.project.Story.sit;

public class vibor3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibor3);
        Button b31=(Button)findViewById(R.id.b31);
        Button b32=(Button)findViewById(R.id.b32);
        Button b33=(Button)findViewById(R.id.b33);
        b31.setText(w[number].text1);
        b32.setText(w[number].text2);
        b33.setText(w[number].text3);


        b31.setOnClickListener((View view) -> {
            destination(1,sit[number].r1,sit[number].r2,sit[number].r3);
            callSituation();
            if (sit[number].variants==3){
                intent = new Intent(this, vibor3.class);
                startActivity(intent);
            }
            if (sit[number].variants==2){
                intent = new Intent(this, vibor2.class);
                startActivity(intent);
            }

        });

        b32.setOnClickListener((View view) -> {
            destination(2,sit[number].r1,sit[number].r2,sit[number].r3);
            callSituation();
            if (sit[number].variants==3){
                intent = new Intent(this, vibor3.class);
                startActivity(intent);
            }
            if (sit[number].variants==2){
                intent = new Intent(this, vibor2.class);
                startActivity(intent);
            }
        });

        b33.setOnClickListener((View view) -> {
            destination(3,sit[number].r1,sit[number].r2,sit[number].r3);
            callSituation();
            if (sit[number].variants==3){
                intent = new Intent(this, vibor3.class);
                startActivity(intent);
            }
            if (sit[number].variants==2){
                intent = new Intent(this, vibor2.class);
                startActivity(intent);
            }
        });
    }

}
