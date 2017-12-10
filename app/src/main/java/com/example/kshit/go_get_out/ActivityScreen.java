package com.example.kshit.go_get_out;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
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
        ListAdapter historyAdapter = new ArrayAdapter<String>(this, R.id.List1, ListofStrings );
    }
}
