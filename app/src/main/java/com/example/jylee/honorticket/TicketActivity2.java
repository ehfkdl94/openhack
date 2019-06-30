package com.example.jylee.honorticket;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TicketActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singer);
        final Button button3 = (Button)findViewById(R.id.button3);
        final Button button8 = (Button)findViewById(R.id.button8);
        final Button button9 = (Button)findViewById(R.id.button9);
        final Button button10 = (Button)findViewById(R.id.button10);
        final Button button11 = (Button)findViewById(R.id.button11);
        final Button button12 = (Button)findViewById(R.id.button12);
        final Button button13 = (Button)findViewById(R.id.button13);
        final Button button14 = (Button)findViewById(R.id.button14);
        final Button button15 = (Button)findViewById(R.id.button15);
        final Button button16 = (Button)findViewById(R.id.button16);
        final Button button17 = (Button)findViewById(R.id.button17);
        final Button button18 = (Button)findViewById(R.id.button18);
        final Button button20 = (Button)findViewById(R.id.button20);
        final Button button21 = (Button)findViewById(R.id.button21);
        final Button button22 = (Button)findViewById(R.id.button22);
        final Button button24 = (Button)findViewById(R.id.button24);

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button8.setBackgroundColor(Color.GRAY);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button9.setBackgroundColor(Color.GRAY);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button10.setBackgroundColor(Color.GRAY);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button11.setBackgroundColor(Color.GRAY);
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button12.setBackgroundColor(Color.GRAY);
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button13.setBackgroundColor(Color.GRAY);
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button14.setBackgroundColor(Color.GRAY);
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button15.setBackgroundColor(Color.GRAY);
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button16.setBackgroundColor(Color.GRAY);
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button17.setBackgroundColor(Color.GRAY);
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button18.setBackgroundColor(Color.GRAY);
            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button20.setBackgroundColor(Color.GRAY);
            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button21.setBackgroundColor(Color.GRAY);
            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button22.setBackgroundColor(Color.GRAY);
            }
        });
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button24.setBackgroundColor(Color.GRAY);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TicketActivity2.this, sepage1.class);
                TicketActivity2.this.startActivity(intent);
            }
        });
    }
}
