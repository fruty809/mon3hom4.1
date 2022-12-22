package com.example.mon3hom41;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class filmViewHolder extends RecyclerView.ViewHolder {
    int a;
    private ImageView filmsImg;
    private TextView filmName;
    private   TextView filmDicription;
    CardView cardView;

    public filmViewHolder(@NonNull View itemView) {
        super(itemView);
        filmsImg = itemView.findViewById(R.id.film_img);
        filmName = itemView.findViewById(R.id.film_name_txt);
        filmDicription = itemView.findViewById(R.id.film_discription);
        cardView = itemView.findViewById(R.id.card_view_film);


    }

    public void bind(int filmsIV, String cinemaName, String cinemaDiscription){
        filmsImg.setImageResource(filmsIV);
        filmName.setText(cinemaName);
        filmDicription.setText(cinemaDiscription);
    }
}
