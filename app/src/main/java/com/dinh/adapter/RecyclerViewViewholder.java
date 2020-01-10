package com.dinh.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewViewholder extends RecyclerView.ViewHolder {
    private TextView textView;

    public RecyclerViewViewholder(View view){
        super(view);
        textView = view.findViewById(android.R.id.text1);
    }

    public void bind(String item){
        textView.setText(item);
    }
}
