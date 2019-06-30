package com.example.jylee.honorticket;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class sepage2 extends AppCompatActivity{






    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.sepage2lay );
        //초기에 버튼이 안보이게 함.-> xml 참고
        final TextView mTextMessage;
        final TextView textt=(TextView)findViewById(R.id.textView7);
        final TextView text44=(TextView) findViewById(R.id.textView17);
        final  Button button7= (Button)findViewById(R.id.button7);
        final Button priceb= (Button)findViewById(R.id.buttoncalcu);
        final Button button5 = (Button)findViewById(R.id.button5);
        final Button button6 = (Button)findViewById(R.id.button6);
        priceb.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
               text44.setText("110,000");
                priceb.setBackgroundColor(Color.rgb(49,153,213));
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button5.setBackgroundColor(Color.rgb(49,153,213));
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button6.setBackgroundColor(Color.rgb(49,153,213));
            }
        });


        button7.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view){
                    Intent intent = new Intent(sepage2.this, sepage3.class);
                    sepage2.this.startActivity(intent);
                }
            });

    }

}
