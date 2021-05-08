package com.kenderanden.tz2021copy_center;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_calculator);


        Spinner spinner = (Spinner) findViewById(R.id.spinnerformat);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.format, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        Spinner spinner2 = (Spinner) findViewById(R.id.spinnerstoroni);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.storon, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
    }
    int sum = 0, TyTyRyStop = 0;
    public void rasiot (View v){
        EditText editText1 = (EditText)findViewById(R.id.editTextNumber);
        TextView textView3 = (TextView)findViewById(R.id.textView3);
        TextView textView4 = (TextView)findViewById(R.id.textView4);
        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        Spinner spinnerformat = (Spinner)findViewById(R.id.spinnerformat);
        Spinner spinnerstoroni = (Spinner)findViewById(R.id.spinnerstoroni);

        if(editText1.getText().length()!=0 ){
            int vivod = 0, storona = 0;
            if(spinnerstoroni.getSelectedItem().toString().equals("Одна сторона")){
                storona = 1;
            }
            else {
                storona = 2;
            }

            if(spinnerformat.getSelectedItem().toString().equals("A6")){
                vivod = 1;
                if(storona == 1)
                    vivod += 1;
                else
                    vivod += 1;
            }
            else if(spinnerformat.getSelectedItem().toString().equals("A5")){
                vivod = 2;
                if(storona == 1)
                    vivod += 1;
                else
                    vivod += 2;
            }
            else if(spinnerformat.getSelectedItem().toString().equals("A4")){
                vivod = 3;
                if(storona == 1)
                    vivod += 1;
                else
                    vivod += 2;
            }
            else if(spinnerformat.getSelectedItem().toString().equals("A3")){
                vivod = 6;
                if(storona == 1)
                    vivod += 2;
                else
                    vivod += 4;
            }
            else if(spinnerformat.getSelectedItem().toString().equals("A2")){
                vivod = 12;
                if(storona == 1)
                    vivod += 4;
                else
                    vivod += 8;
            }
            vivod = vivod * Integer.parseInt(editText1.getText().toString());

            sum += vivod;
            textView3.setText(String.valueOf(sum) + " Руб.");
            Button button = (Button)findViewById(R.id.button);
            button.setText("Рассчитать+");
            if(sum > 10000 && TyTyRyStop == 0){
                textView4.setText("Более десяти тысяч! Без мешка не обойтись!");
                imageView.setImageResource(R.drawable.megumin);
                MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.tuturu);
                mediaPlayer.start();
                TyTyRyStop = 1;
            }
            else if(sum >1000 && TyTyRyStop == 0){
                textView4.setText("Более Тысячи! Так держать!");
                imageView.setImageResource(R.drawable.beta_iuxy);
            }

        }
    }

    public void sbros (View v){
        sum = 0;

        TyTyRyStop = 0;

        TextView textView4 = (TextView)findViewById(R.id.textView4);
        textView4.setText("");

        TextView textView3 = (TextView)findViewById(R.id.textView3);
        textView3.setText("");

        Button button = (Button)findViewById(R.id.button);
        button.setText("Рассчитать");

        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.cat);
    }

    public void spisok (View v){
        Intent intent = new Intent(".spisok");
        startActivity(intent);
    }
}