package com.example.konuk_31pr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {
    float x1, x2, y1, y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        i = new Intent(this, MainActivity2.class);
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
                if (x1 < x2)
                {
                    Intent i = new Intent(MainActivity3.this, MainActivity2.class);
                    startActivity(i);
                }
                break;
        }
        return false;
    }
}