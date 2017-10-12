package com.example.wildanifqie.resepmakanan;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by wildanifqie on 11/10/2017.
 */

class ResepAdapter extends RecyclerView.Adapter<ResepAdapter.ResepViewHolder>{

    private Context ctx;
    private ArrayList<Resep>dataResep;

    ResepAdapter(Context ctx, ArrayList<Resep> dataResep) {
        this.ctx = ctx;
        this.dataResep = dataResep;
    }

    @Override
    public ResepAdapter.ResepViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.resep,parent,false);
        return new ResepViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ResepAdapter.ResepViewHolder holder, final int position) {
        holder.judul.setText(dataResep.get(position).getJudul());
        holder.ket.setText(dataResep.get(position).getKet());


        holder.itemView.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v) {
                Intent it1 = new Intent(ctx, DetailResep.class);
                it1.putExtra("judul",dataResep.get(position).getJudul());
                it1.putExtra("gambar",dataResep.get(position).getGambar());
                it1.putExtra("deskripsi",dataResep.get(position).getDeskripsi());
                ctx.startActivity(it1);
            }


        });
    }

    @Override
    public int getItemCount() {
        return dataResep.size();
    }

    class ResepViewHolder extends RecyclerView.ViewHolder {
        TextView judul;
        TextView ket;
        ResepViewHolder(View itemView){
            super(itemView);
            judul = (TextView)itemView.findViewById(R.id.txtJudul);
            ket = (TextView)itemView.findViewById(R.id.txtKet);
        }
    }
}
