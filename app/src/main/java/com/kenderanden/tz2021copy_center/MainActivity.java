package com.kenderanden.tz2021copy_center;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //getSupportActionBar().hide();


        setContentView(R.layout.activity_main);
    }

    public void openCalculator(View v){
        Intent intent = new Intent(".calculator");
        startActivity(intent);
    }

    public void openMap(View v){
        Intent intent = new Intent(".map");
        startActivity(intent);
    }

    public void openRandomImage (View v){
        Intent intent = new Intent(".RandomImage");
        startActivity(intent);
    }
}