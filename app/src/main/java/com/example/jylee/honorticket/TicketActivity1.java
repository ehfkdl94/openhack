/*package com.example.jylee.honorticket;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TicketActivity1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectcatlay);
        final Button buttonc = (Button)findViewById(R.id.buttonc);
        buttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TicketActivity1.this, TicketActivity2.class);
                TicketActivity1.this.startActivity(intent);
            }
        });
    }
}
*/