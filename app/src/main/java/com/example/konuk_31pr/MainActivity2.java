package com.example.konuk_31pr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    float x1, x2, y1, y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void onClick1(View view) {
        Intent i;
        i = new Intent(this, MainActivity3.class);
        startActivity(i);
    }
    public boolean onTouchEvent(MotionEvent TouchEvent) {
        switch (TouchEvent.getAction()) {
            case MotionEvent.ACTION_DOWN:
                x1 = TouchEvent.getX();
                y1 = TouchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = TouchEvent.getX();
                y2 = TouchEvent.getY();
                if (x1 > x2)
                {
                    Intent i = new Intent(MainActivity2.this, MainActivity3.class);
                    startActivity(i);
                }
                else if (x1 < x2)
                {
                    Intent i = new Intent(MainActivity2.this, MainActivity.class);
                    startActivity(i);
                }
                break;
        }
        return false;
    }
}