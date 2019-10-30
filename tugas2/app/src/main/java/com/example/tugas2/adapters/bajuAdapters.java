package com.example.tugas2.adapters;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugas2.R;
import com.example.tugas2.models.baju;

import java.util.List;

public class bajuAdapters extends RecyclerView.Adapter<bajuAdapters.MyViewHolder>{
    List<baju> bajuList;

    public bajuAdapters(List<baju> bajuList){
        this.bajuList = bajuList;
    }
    @NonNull
    @Override
    public bajuAdapters.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View bajuView = layoutInflater.inflate(R.layout.item_baju,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(bajuView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull bajuAdapters.MyViewHolder holder, int position) {
        baju Baju = bajuList.get(position);
        Context context = holder.gambarproduk.getContext();
        Integer resId = context.getResources().getIdentifier(Baju.getGambar(), "drawable", context.getPackageName());
        holder.gambarproduk.setImageResource(resId);
        holder.namaProduk.setText(Baju.getNamaBaju());
        holder.bahanProduk.setText(Baju.getBahanBaju());
        holder.hargaProduk.setText("Rp. "+Baju.getHargaBaju());
    }

    @Override
    public int getItemCount() {
        return (bajuList != null) ? bajuList.size():0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView gambarproduk;
        public TextView namaProduk;
        public TextView bahanProduk;
        public TextView hargaProduk;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            gambarproduk = itemView.findViewById(R.id.iv_gambarProduk);
            namaProduk = itemView.findViewById(R.id.tv_name);
            bahanProduk = itemView.findViewById(R.id.tv_bahan);
            hargaProduk = itemView.findViewById(R.id.tv_harga);
        }
    }
}
