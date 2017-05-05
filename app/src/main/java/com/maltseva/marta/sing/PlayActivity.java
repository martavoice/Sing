package com.maltseva.marta.sing;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Марта on 03.05.2017.
 */

public class PlayActivity extends Activity implements View.OnClickListener{
    TextView song1;
    TextView song2;
    TextView song3;

    Button play1;
    Button play2;
    Button play3;

    Button stop1;
    Button stop2;
    Button stop3;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_activity);
        init();
        setListeners();
    }

    @Override
    public void onClick(View v) {
       switch (v.getId()){
           case R.id.play1:
           case R.id.play2:
           case R.id.play3:
           case R.id.stop1:
           case R.id.stop2:
           case R.id.stop3:
       }
    }

    private void setListeners() {
        play1.setOnClickListener(this);
        play2.setOnClickListener(this);
        play3.setOnClickListener(this);
        stop1.setOnClickListener(this);
        stop2.setOnClickListener(this);
        stop3.setOnClickListener(this);
    }

    private void init() {
        song1 = (TextView)findViewById(R.id.first);
        song2 = (TextView)findViewById(R.id.second);
        song3 = (TextView)findViewById(R.id.third);
        play1 = (Button) findViewById(R.id.play1);
        play2 = (Button) findViewById(R.id.play2);
        play3 = (Button) findViewById(R.id.play3);
        stop1 = (Button) findViewById(R.id.stop1);
        stop2 = (Button) findViewById(R.id.stop2);
        stop3 = (Button) findViewById(R.id.stop3);
        mp = new MediaPlayer();
    }
}
