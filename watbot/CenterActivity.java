package com.example.vmac.watbot;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CenterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_center);
    }

    public void botClick(View v) {
        Intent intent = new Intent(this, BotActivity.class);
        startActivity(intent);
    }

    public void babyClick(View v) {
        Intent intent = new Intent(this, BabyActivity.class);
        startActivity(intent);
    }
}
