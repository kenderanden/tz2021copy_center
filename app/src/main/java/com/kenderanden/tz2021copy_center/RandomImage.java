package com.kenderanden.tz2021copy_center;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RandomImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_image);
    }

    int a = 0, box, im;
    public void click(View v){
        a++;
        do {
            im = (int) (1 + Math.random() * 59);
        }while (box==im);
        box = im;
        String str = "Ты нажал сюда " + a + " раз";
        TextView text_button = (TextView)findViewById(R.id.button);
        text_button.setText(str);


        ImageView imageView = (ImageView)findViewById(R.id.image);
        switch(im){
            case 1:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image1));
                return;
            case 2:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image2));
                return;
            case 3:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image3));
                return;
            case 4:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image4));
                return;
            case 5:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image5));
                return;
            case 6:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image6));
                return;
            case 7:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image7));
                return;
            case 8:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image8));
                return;
            case 9:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image9));
                return;
            case 10:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image10));
                return;
            case 11:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image11));
                return;
            case 12:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image12));
                return;
            case 13:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image13));
                return;
            case 14:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image14));
                return;
            case 15:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image15));
                return;
            case 16:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image16));
                return;
            case 17:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image17));
                return;
            case 18:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image18));
                return;
            case 19:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image19));
                return;
            case 20:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image20));
                return;
            case 21:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image21));
                return;
            case 22:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image22));
                return;
            case 23:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image23));
                return;
            case 24:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image24));
                return;
            case 25:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image25));
                return;
            case 26:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image26));
                return;
            case 27:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image27));
                return;
            case 28:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image28));
                return;
            case 29:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image29));
                return;
            case 30:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image30));
                return;
            case 31:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image31));
                return;
            case 32:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image32));
                return;
            case 33:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image33));
                return;
            case 34:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image34));
                return;
            case 35:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image35));
                return;
            case 36:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image36));
                return;
            case 37:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image37));
                return;
            case 38:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image38));
                return;
            case 39:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image39));
                return;
            case 40:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image40));
                return;
            case 41:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image41));
                return;
            case 42:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image42));
                return;
            case 43:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image43));
                return;
            case 44:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image44));
                return;
            case 45:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image45));
                return;
            case 46:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image46));
                return;
            case 47:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image47));
                return;
            case 48:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image48));
                return;
            case 49:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image49));
                return;
            case 50:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image50));
                return;
            case 51:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image51));
                return;
            case 52:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image52));
                return;
            case 53:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image53));
                return;
            case 54:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image54));
                return;
            case 55:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image55));
                return;
            case 56:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image56));
                return;
            case 57:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image57));
                return;
            case 58:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image58));
                return;
            case 59:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.image59));
                return;
        }
    }
}