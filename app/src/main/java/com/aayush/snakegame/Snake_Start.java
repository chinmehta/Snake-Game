package com.aayush.snakegame;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Snake_Start extends AppCompatActivity implements View.OnClickListener {
//declare
    Button playButton,creditButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_snake__start);
        //downcasting
        playButton=(Button)findViewById(R.id.playbutton);
        creditButton=(Button)findViewById(R.id.creditButton);

        //attach listener

        playButton.setOnClickListener(this);
        creditButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.playbutton:
                Intent intent=new Intent(Snake_Start.this,Snake_game.class);
                startActivity(intent);
                break;
            case R.id.creditButton:
                Intent intent1=new Intent(Snake_Start.this,Snake_credit.class);
                startActivity(intent1);
        }
    }
}
