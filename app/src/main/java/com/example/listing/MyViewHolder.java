package com.example.listing;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView nameView, sinopseView, editoraView, yearView;
    RelativeLayout cardView;
    Button deleteButton;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageview);
        nameView = itemView.findViewById(R.id.name);
        sinopseView = itemView.findViewById(R.id.sinopse);
        editoraView = itemView.findViewById(R.id.editora);
        yearView = itemView.findViewById(R.id.ano);
        cardView = itemView.findViewById(R.id.containerItem);
        deleteButton = itemView.findViewById(R.id.deleteButton);
    }
}
