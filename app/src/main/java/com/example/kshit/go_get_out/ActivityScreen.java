package com.example.kshit.go_get_out;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.List;

public class ActivityScreen extends AppCompatActivity {

    public static Long start;
    public static int type = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);

        Button next = (Button)findViewById(R.id.tadayAct);
        Button walk = (Button)findViewById(R.id.walk);
        Button jog = (Button)findViewById(R.id.jog);
        Button run = (Button)findViewById(R.id.run);

        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                start = SystemClock.elapsedRealtime();
                Intent myIntent = new Intent(view.getContext(), MapsActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });

        walk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                type = 0;
            }
        });

        jog.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                type = 1;
            }
        });

        run.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                type = 2;
            }
        });

    }
}
