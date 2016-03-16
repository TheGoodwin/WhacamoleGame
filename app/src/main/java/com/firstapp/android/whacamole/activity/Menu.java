package com.firstapp.android.whacamole.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.firstapp.android.whacamole.R;
import com.firstapp.android.whacamole.score.Score;


public class Menu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Whac' A Mole !");
        setContentView(R.layout.activity_menu);
    }

    public void go_to_pseudo(View view){
        Intent intent1 = new Intent(Menu.this , Difficulte.class);
        startActivity(intent1);
    }

    public void go_to_score(View view){
        Intent intent2 = new Intent(Menu.this, Score.class);
        startActivity(intent2);


    }



}
