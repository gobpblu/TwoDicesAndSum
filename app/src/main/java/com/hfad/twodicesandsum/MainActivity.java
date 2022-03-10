package com.hfad.twodicesandsum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random random = new Random();
    ImageView imageView1;
    ImageView imageView2;
    TextView textView;
    int firstNum, secondNum, sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dice(View view) {
        imageView1 = findViewById(R.id.dice1);
        imageView2 = findViewById(R.id.dice2);
        textView = findViewById(R.id.sum);
        firstNum = random.nextInt(6) + 1;
        secondNum = random.nextInt(6) + 1;
        sum = 0;
        switch (firstNum) {
            case 1:
                imageView1.setImageResource(R.drawable.dice1_foreground);
                sum += 1;
                break;
            case 2:
                imageView1.setImageResource(R.drawable.dice2_foreground);
                sum += 2;
                break;
            case 3:
                imageView1.setImageResource(R.drawable.dice3_foreground);
                sum += 3;
                break;
            case 4:
                imageView1.setImageResource(R.drawable.dice4_foreground);
                sum += 4;
                break;
            case 5:
                imageView1.setImageResource(R.drawable.dice5_foreground);
                sum += 5;
                break;
            case 6:
                imageView1.setImageResource(R.drawable.dice6_foreground);
                sum += 6;
                break;
        }

        switch (secondNum) {
            case 1:
                imageView2.setImageResource(R.drawable.dice1_foreground);
                sum += 1;
                break;
            case 2:
                imageView2.setImageResource(R.drawable.dice2_foreground);
                sum += 2;
                break;
            case 3:
                imageView2.setImageResource(R.drawable.dice3_foreground);
                sum += 3;
                break;
            case 4:
                imageView2.setImageResource(R.drawable.dice4_foreground);
                sum += 4;
                break;
            case 5:
                imageView2.setImageResource(R.drawable.dice5_foreground);
                sum += 5;
                break;
            case 6:
                imageView2.setImageResource(R.drawable.dice6_foreground);
                sum += 6;
                break;
        }
        String s = "Sum = " + sum;
        textView.setText(s);
    }
}