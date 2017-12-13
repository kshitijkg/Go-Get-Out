package com.example.kshit.go_get_out;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FinishActivity extends AppCompatActivity {

    private double spd = MapsActivity.distance / MapsActivity.difference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        Button next = (Button)findViewById(R.id.finishbutton);
        TextView distance = (TextView) findViewById(R.id.distance);
        TextView time = (TextView) findViewById(R.id.time);
        TextView speed = (TextView) findViewById(R.id.speed);
        TextView suc = (TextView) findViewById(R.id.textView5);

        String dis = String.valueOf(MapsActivity.distance);
        distance.setText("distance: "+dis+"meters");
        distance.setTextSize(20);
        String t = String.valueOf(MapsActivity.difference);
        time.setText("Time: " + t +"s");
        time.setTextSize(20);
        String mps = String.valueOf(spd);
        speed.setText("Speed: " + mps + "m/s");
        speed.setTextSize(18);
        suc.setTextSize(20);

        if (ActivityScreen.type == 0) {
            if (spd > 0.0 && spd < 2.0) {
                suc.setText("Good job!");
            } else {
                suc.setText("Sorry,too fast.");
            }
        }

        if (ActivityScreen.type == 1) {
            if (spd > 2.0 && spd < 3.5) {
                suc.setText("Good job!");
            } else {
                if (spd < 2.0) {
                    suc.setText("Sorry, too slow.");
                } else {
                    suc.setText("Sorry, too fast.");
                }
            }
        }

        if (ActivityScreen.type == 2) {
            if (spd > 3.5 && spd < 10.2) {
                suc.setText("Good job!");
            } else {
                if (spd < 3.5) {
                    suc.setText("Sorry, too slow.");
                } else {
                    suc.setText("Sorry, too fast.");
                }
            }
        }



        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), ActivityScreen.class);
                startActivityForResult(myIntent, 0);
            }
        });


    }

}
