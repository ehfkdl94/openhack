package com.example.jylee.honorticket;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TicketbuyActivity extends AppCompatActivity {
    Button buyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticketbuy);

        buyBtn = (Button)findViewById(R.id.buyBtn);
        buyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TicketbuyActivity.this, Ticketbuy2Activity.class);
                startActivity(intent);
            }
        });

    }
}
