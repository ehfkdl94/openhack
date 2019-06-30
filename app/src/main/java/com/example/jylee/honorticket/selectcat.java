package com.example.jylee.honorticket;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ActivityChooserView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class selectcat extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectcatlay );
        final Button buttonc= (Button)findViewById(R.id.buttonc);
        buttonc.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(selectcat.this, TicketActivity2.class);
                selectcat.this.startActivity(intent);
            }
        });

    }

}
