package com.example.laboratorio5_b61830;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
}