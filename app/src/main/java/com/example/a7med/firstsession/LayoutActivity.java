package com.example.a7med.firstsession;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
    }

    public void linear(View view)
    {
        Intent intent = new Intent(this,LinearActivity.class);
        startActivity(intent);
    }

    public void relat(View view)
    {
        Intent intent = new Intent(this,RelativeActivity.class);
        startActivity(intent);
    }


    public void frame(View view)
    {
        Intent intent = new Intent(this,FrameActivity.class);
        startActivity(intent);
    }
}
