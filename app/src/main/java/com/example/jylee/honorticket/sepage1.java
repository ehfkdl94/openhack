package com.example.jylee.honorticket;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class sepage1 extends AppCompatActivity {
    public String YYt, MMt, DDt;
    private TextView mTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView(R.layout.sepage1lay );

        Spinner dropdown = (Spinner)findViewById(R.id.spinner1);
        String[] items = new String[]{"1", "2", "three"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

        mTextMessage = (TextView) findViewById(R.id.textView9 );

        Button button2 = (Button) findViewById(R.id.button2 );

        button2.setOnClickListener( new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(sepage1.this, sepage2.class);
                sepage1.this.startActivity(intent);
            }
        } );

    }
    }

