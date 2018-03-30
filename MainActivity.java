package com.example.project;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Timer;
import java.util.TimerTask;
import static com.example.project.Main.igra;
import static com.example.project.Main.varian;
import static com.example.project.Situation.destination;
import static com.example.project.Story.callSituation;
import static com.example.project.Varianti.w;

public class MainActivity extends AppCompatActivity {

    public static int number=0;
    public static Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button b=(Button)findViewById(R.id.b);
        varian();
        b.setOnClickListener(view ->{
            callSituation();
            Log.d("callnum",Integer.toString(number));
            intent = new Intent(this, vibor3.class);
            startActivity(intent);
        });

    }

}
