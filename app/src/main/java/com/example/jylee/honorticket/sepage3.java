package com.example.jylee.honorticket;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class sepage3 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.sepage3lay );
        //초기에 버튼이 안보이게 함.-> xml 참고


        Button button2 = (Button) findViewById( R.id.button2 );
        button2.setOnClickListener( new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(sepage3.this, MainActivity.class);
                sepage3.this.startActivity(intent);
            }
        } );
    }
}
