package com.example.jylee.honorticket;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView plusshow;

    Adapter adapter;
    ViewPager viewpager;

    ImageView selectcat;

    String uid,pw, uname, email, phnum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewpager = (ViewPager)findViewById(R.id.view);
        adapter = new Adapter(this);
        viewpager.setAdapter(adapter);

       /* Intent intent = getIntent();
        uid = intent.getStringExtra("uid");
        pw = intent.getStringExtra("pw");
        email = intent.getStringExtra("email");
        uname = intent.getStringExtra("uname");
        phnum = intent.getStringExtra("phnum"); */

        plusshow = (TextView) findViewById(R.id.plusshow);
        plusshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(intent);
            }
        });

        selectcat = (ImageView)findViewById(R.id.selectcat);
        selectcat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, selectcat.class);
                startActivity(intent);
            }
        });

    }
}
