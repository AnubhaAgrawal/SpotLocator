package com.example.anubha.spot_locator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Basic extends AppCompatActivity {

    public ImageButton button1;

    public void init()
    {
        button1 = (ImageButton)findViewById(R.id.imageButton1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy =new Intent(Basic.this,Restaurant.class);
                startActivity(toy);
            }
        });
    }
    public ImageButton button3;

    public void init1()
    {
        button3 = (ImageButton)findViewById(R.id.imageButton3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy =new Intent(Basic.this,Schools.class);
                startActivity(toy);
            }
        });
    }
    public ImageButton button;

    public void init2()
    {
        button = (ImageButton)findViewById(R.id.imageButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy =new Intent(Basic.this,Hospitals.class);
                startActivity(toy);
            }
        });
    }
    public ImageButton button2;

    public void init3()
    {
        button2 = (ImageButton)findViewById(R.id.imageButton2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toy =new Intent(Basic.this,Atms.class);
                startActivity(toy);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
        init();
        init1();
        init2();
        init3();
    }
}
