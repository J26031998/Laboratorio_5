package com.example.laboratorio5_b61830;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

//public class MainActivity extends AppCompatActivity implements View.OnClickListener {
public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer BruhMP = MediaPlayer.create(this, R.raw.bruh);
        final MediaPlayer chickensMP = MediaPlayer.create(this, R.raw.chickens);
        final MediaPlayer dnutsMP = MediaPlayer.create(this, R.raw.deeznuts);
        final MediaPlayer turtlesMP = MediaPlayer.create(this, R.raw.turtles);
        final MediaPlayer naniMP = MediaPlayer.create(this, R.raw.nani);
        final MediaPlayer weMP = MediaPlayer.create(this, R.raw.we);

        Button button1 = (Button) this.findViewById(R.id.button1);
        Button button2 = (Button) this.findViewById(R.id.button2);
        Button button3 = (Button) this.findViewById(R.id.button3);
        Button button4 = (Button) this.findViewById(R.id.button4);
        Button button5 = (Button) this.findViewById(R.id.button5);
        Button button6 = (Button) this.findViewById(R.id.button6);

        /*
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
         */
        final boolean[] tmp1 = {false};
        final boolean[] tmp2 = {false};
        final boolean[] tmp3 = {false};
        final boolean[] tmp4 = {false};
        final boolean[] tmp5 = {false};
        final boolean[] tmp6 = {false};


        button1.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               BruhMP.start();
               tmp1[0] = !tmp1[0];
               v.setBackgroundColor(tmp1[0] ? Color.RED : Color.BLUE);
           }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                chickensMP.start();
                tmp2[0] = !tmp2[0];
                v.setBackgroundColor(tmp2[0] ? Color.RED : Color.BLUE);
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                dnutsMP.start();
                tmp3[0] = !tmp3[0];
                v.setBackgroundColor(tmp3[0] ? Color.RED : Color.BLUE);
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                turtlesMP.start();
                tmp4[0] = !tmp4[0];
                v.setBackgroundColor(tmp4[0] ? Color.RED : Color.BLUE);
            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                naniMP.start();
                tmp5[0] = !tmp5[0];
                v.setBackgroundColor(tmp5[0] ? Color.RED : Color.BLUE);
            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                weMP.start();
                tmp6[0] = !tmp6[0];
                v.setBackgroundColor(tmp6[0] ? Color.RED : Color.BLUE);
            }
        });



    }


    /*
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Toast.makeText(this, "Button 1 clicked", Toast.LENGTH_SHORT).show();
                BruhMP.start()
                break;
            case R.id.button2:
                Toast.makeText(this, "Button 2 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(this, "Button 3 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Toast.makeText(this, "Button 4 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Toast.makeText(this, "Button 5 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button6:
                Toast.makeText(this, "Button 6 clicked", Toast.LENGTH_SHORT).show();
                break;
        }
    } */
}