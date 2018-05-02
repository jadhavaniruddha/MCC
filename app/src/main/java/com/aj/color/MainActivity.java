package com.aj.color;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button red,blue,yellow,green;
        red = findViewById(R.id.red);
        blue = findViewById(R.id.blue);
        yellow = findViewById(R.id.yellow);
        green = findViewById(R.id.green);

        final TextView bck = findViewById(R.id.bck);

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bck.setBackgroundColor(Color.RED);
                bck.setText("RED");
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bck.setBackgroundColor(Color.BLUE);
                bck.setText("BLUE");
            }
        });

        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bck.setBackgroundColor(Color.YELLOW);
                bck.setText("YELLOW");
            }
        });

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bck.setBackgroundColor(Color.GREEN);
                bck.setText("GREEN");
            }
        });
    }
}
