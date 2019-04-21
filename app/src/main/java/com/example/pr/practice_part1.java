package com.example.pr;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import java.io.IOException;

public class practice_part1 extends AppCompatActivity {
    Button start, pause, next;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_part1);

        start = (Button) findViewById(R.id.button1);
        pause = (Button) findViewById(R.id.button2);
        next = (Button) findViewById(R.id.button3);
        //mp = MediaPlayer.create(this, R.raw.test);

        //creating media player
        mp = new MediaPlayer();
        mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mp = MediaPlayer.create(this, R.raw.test);
//            mp.prepare();
            mp.start();

        start.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
        pause.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
            }
        });
        next.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    
}
