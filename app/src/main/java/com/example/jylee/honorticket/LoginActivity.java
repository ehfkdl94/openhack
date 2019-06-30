package com.example.jylee.honorticket;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText idText = (EditText)findViewById(R.id.idText);
        final EditText passwordText = (EditText)findViewById(R.id.passwordText);
        final Button loginButton = (Button)findViewById(R.id.loginButton);
        final Button registerButton1 = (Button)findViewById(R.id.registerButton1);

        //버튼이 눌리면 RegisterActivity로 가게함
        registerButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);
            }
        });
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String uid = idText.getText().toString();
                final String pw = passwordText.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>(){
                    @Override
                    public void onResponse(String response){
                        System.out.println("response : " + response);
                        try{
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            System.out.println(success);
                            if(success){
                                System.out.println("success log");
                                String uid = jsonResponse.getString("uid");
                                String pw = jsonResponse.getString("pw");

                                String uname = jsonResponse.getString("uname");
                                String email = jsonResponse.getString("email");
                                String phnum = jsonResponse.getString("phnum");

                                //Intent intent = new Intent(LoginActivity.this, MainActivity2.class);

                                Intent intent = new Intent(LoginActivity.this, MenuActivity.class);

                                intent.putExtra("uid", uid);
                                intent.putExtra("pw", pw);
                                intent.putExtra("uname", uname);
                                intent.putExtra("email", email);
                                intent.putExtra("phnum", phnum);

                                System.out.println("된다");

                                LoginActivity.this.startActivity(intent);
                            }
                            else{
                                System.out.println("fail log");
                                AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                                builder.setMessage("로그인에 실패하였습니다.")
                                        .setNegativeButton("다시 시도", null)
                                        .create()
                                        .show();
                            }
                        } catch (Exception e)
                        {
                            System.out.println("exception here");
                            e.printStackTrace();
                        }
                    }
                };
                LoginRequest loginRequest = new LoginRequest(uid, pw, responseListener);
                RequestQueue queue = Volley.newRequestQueue(LoginActivity.this);
                queue.add(loginRequest);
            }
        });


    }
}