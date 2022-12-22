package com.example.mon3hom41;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class filmAdapter extends RecyclerView.Adapter<filmViewHolder> {



    private ArrayList<filmModel> filmLIst;
    private ItemClickListener clickListener;

    public filmAdapter(ArrayList<filmModel> filmModels, ItemClickListener clickListener) {
        this.filmLIst = filmModels;
        this.clickListener = clickListener;
    }



    @NonNull
    @Override
    public filmViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new filmViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.films, parent,false));
    }

    @Override
    @SuppressLint("RecyclerView")
    public void onBindViewHolder(@NonNull filmViewHolder holder, int position) {
        holder.bind(filmLIst.get(position).image, filmLIst.get(position).filmName,filmLIst.get(position).filmDiscription);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickListener.onItemClick(filmLIst.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return filmLIst.size();
    }
}
