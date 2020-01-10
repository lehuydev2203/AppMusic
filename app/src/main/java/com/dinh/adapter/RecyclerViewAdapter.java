package com.dinh.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewViewholder> {
    private List<String> listItems;

    public RecyclerViewAdapter(List<String> listItems){
        this.listItems = listItems;
    }

    @NonNull
    @Override
    public RecyclerViewViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent,
                false);
        RecyclerViewViewholder viewHolder = new RecyclerViewViewholder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewViewholder holder, int position) {
        holder.bind(listItems.get(position));
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }
}
