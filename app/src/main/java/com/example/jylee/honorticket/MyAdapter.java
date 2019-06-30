package com.example.jylee.honorticket;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    public static class MyViewHolder extends RecyclerView.ViewHolder {
       // ImageView ivPicture;
        TextView tkTitle;
        TextView tkPrice;

        MyViewHolder(View view){
            super(view);
          //  ivPicture = view.findViewById(R.id.iv_picture);
            tkTitle = view.findViewById(R.id.tk_title);
            tkPrice = view.findViewById(R.id.tk_price);

            // 아이템 클릭 이벤트 처리.
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // TODO : process click event.
                    Intent intent = new Intent(v.getContext(),TicketbuyActivity.class);
                    v.getContext().startActivity(intent);
                }
            });

        }


    }

    private ArrayList<TicketTitle> ticketTitleArrayList;
    MyAdapter(ArrayList<TicketTitle> ticketTitleArrayList){
        this.ticketTitleArrayList = ticketTitleArrayList;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_row, parent, false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {


        MyViewHolder myViewHolder = (MyViewHolder) holder;

        myViewHolder.tkTitle.setText(ticketTitleArrayList.get(position).Tickettitle);
        myViewHolder.tkPrice.setText(ticketTitleArrayList.get(position).price);


    }

    @Override
    public int getItemCount() {
        return ticketTitleArrayList.size();
    }


}


