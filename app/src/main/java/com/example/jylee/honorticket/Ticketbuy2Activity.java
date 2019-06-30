package com.example.jylee.honorticket;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Ticketbuy2Activity extends AppCompatActivity implements View.OnClickListener{
    Button buybutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticketbuy2);

        findViewById(R.id.buyButton2).setOnClickListener(this);

    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.buyButton2:
                new AlertDialog.Builder(this)
                        .setTitle("결제 알림")
                        .setMessage("결제가 완료되었습니다.")
                        .setNeutralButton("확인", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dlg, int sumthin) {

                            }
                        })
                        .show();


                break;

        }
    }
}

