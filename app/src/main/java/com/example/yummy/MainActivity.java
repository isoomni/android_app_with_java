package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;

import android.app.slice.SliceItem;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.iv_like).setOnClickListener(this);
        findViewById(R.id.iv_share).setOnClickListener(this);

        findViewById(R.id.iv_photo).setOnTouchListener(this);
    }

    @Override
    public void onClick(View view){ //when click it!
        switch (view.getId()){
            case R.id.iv_like:
                Toast.makeText(MainActivity.this, "Like", Toast.LENGTH_SHORT).show();
                break;

            case R.id.iv_share:
                Toast.makeText(MainActivity.this, "Share", Toast.LENGTH_SHORT).show();
                break;

        }
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        switch (motionEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                Toast.makeText(MainActivity.this, "Yummy", Toast.LENGTH_SHORT).show();
                break;
            case MotionEvent.ACTION_UP:
                break;
        }
        return true;
    }
}