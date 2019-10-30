package com.example.tugas1.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugas1.R;
import com.example.tugas1.models.Members;

import java.util.List;

public class MembersAdapter extends RecyclerView.Adapter<MembersAdapter.MyViewHolder> {
    List<Members> membersList;

    public MembersAdapter(List<Members> membersList) {
        this.membersList = membersList;
    }

    @NonNull
    @Override
    public MembersAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View Memberview = layoutInflater.inflate(R.layout.item_members,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(Memberview);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MembersAdapter.MyViewHolder holder, int position) {
        Members members = membersList.get(position);
        holder.memberName.setText(members.getNama());
        holder.memberAge.setText(members.getUmur()+" Tahun");
    }

    @Override
    public int getItemCount() {
        return (membersList != null) ? membersList.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageAvatar;
        public TextView memberName;
        public TextView memberAge;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageAvatar = itemView.findViewById(R.id.iv_avatar);
            memberName = itemView.findViewById(R.id.tv_name);
            memberAge = itemView.findViewById(R.id.tv_age);
        }
    }
}
