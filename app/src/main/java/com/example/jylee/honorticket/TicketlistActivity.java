package com.example.jylee.honorticket;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;

import java.util.ArrayList;

//RecyclerView관련 여러 오픈 소스 예제를 참고
public class TicketlistActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;

    ImageView exo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticketlist);

        exo = findViewById(R.id.exo);
        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        ArrayList<TicketTitle> ticketTitleArrayList = new ArrayList<>();
        ticketTitleArrayList.add(new TicketTitle("EXO PLANET#5 - EXplOration", "121,000원"));
        ticketTitleArrayList.add(new TicketTitle("EXO PLANET#4 - The EℓyXiOn ", "121,000원"));
        ticketTitleArrayList.add(new TicketTitle("SBS 파워FM 20주년 콘서트 POWER ", "121,000원"));
        ticketTitleArrayList.add(new TicketTitle("2016 아시아송페스티벌  ", "121,000원"));
        ticketTitleArrayList.add(new TicketTitle("EXO PLANET #3 - The EXO’rDIUM ", "121,000원"));
        ticketTitleArrayList.add(new TicketTitle("SUWON K-POP SUPER CONCERT ", "121,000원"));
        ticketTitleArrayList.add(new TicketTitle("2016 드림콘서트 ", "121,000원"));
        ticketTitleArrayList.add(new TicketTitle("The EXO＇luXion [EPILOGUE]SMTOWN ", "121,000원"));
        ticketTitleArrayList.add(new TicketTitle("2015 강남 한류페스티벌 ", "121,000원"));


        MyAdapter myAdapter = new MyAdapter(ticketTitleArrayList);
        mRecyclerView.setAdapter(myAdapter);



    }
}


/*
 holder.mView.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Intent intent = new Intent(v.getContext(),TicketbuyActivity.class);
        v.getContext().startActivity(intent);
        }
        }); */