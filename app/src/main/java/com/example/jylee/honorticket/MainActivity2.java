package com.example.jylee.honorticket;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView idText = (TextView)findViewById(R.id.idText);
        TextView passwordText = (TextView)findViewById(R.id.passwordText);
        TextView unameText = (TextView)findViewById(R.id.unameText);
        TextView emailText = (TextView)findViewById(R.id.emailText);
        TextView phnumText = (TextView)findViewById(R.id.phnumText);
        TextView welcomMessage = (TextView)findViewById(R.id.welcomMessage);

        Intent intent = getIntent();
        String uid = intent.getStringExtra("uid");
        String pw = intent.getStringExtra("pw");
        String email = intent.getStringExtra("email");
        String uname = intent.getStringExtra("uname");
        String phnum = intent.getStringExtra("phnum");
        String message = "환영합니다, " + uid + "님!";

        idText.setText(uid);
        passwordText.setText(pw);
        emailText.setText(email);
        unameText.setText(uname);
        phnumText.setText(phnum);
        welcomMessage.setText(message);
    }
}
