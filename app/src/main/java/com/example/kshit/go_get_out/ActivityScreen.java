package com.example.kshit.go_get_out;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.List;

public class ActivityScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);
        String[] ListofStrings = {"String1","String2","String3","String4"};
        ListView history = (ListView) findViewById(R.id.List1);
        ListAdapter historyAdapter =  new ArrayAdapter<String>(this, R.id.List1, ListofStrings );
        Button next = (Button)findViewById(R.id.tadayAct);
        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), MapsActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
