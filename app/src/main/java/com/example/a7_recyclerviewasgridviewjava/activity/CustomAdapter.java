package com.example.a7_recyclerviewasgridviewjava.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a7_recyclerviewasgridviewjava.R;
import com.example.a7_recyclerviewasgridviewjava.model.Member;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter {
    Context context;
    List<Member> members;

    public CustomAdapter(Context context, List<Member> members) {
        this.context = context;
        this.members = members;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_activity_view, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Member member = members.get(position);
        if (holder instanceof CustomViewHolder){
            TextView tv_name = ((CustomViewHolder) holder).tv_name;
            TextView tv_tel_number = ((CustomViewHolder) holder).tv_tel_number;

            tv_name.setText(member.getName());
            tv_tel_number.setText(member.getTelNumber());
        }
    }

    @Override
    public int getItemCount() {
        return members.size();
    }

    private class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView tv_name;
        TextView tv_tel_number;

        View view;
        public CustomViewHolder(View v) {
            super(v);
            view = v;

            tv_name = view.findViewById(R.id.tv_name);
            tv_tel_number = view.findViewById(R.id.tv_tel_number);

        }
    }
}
