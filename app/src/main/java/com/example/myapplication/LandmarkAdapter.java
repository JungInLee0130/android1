package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LandmarkAdapter extends RecyclerView.Adapter<LandmarkAdapter.ViewHolder> {
    ArrayList<LandMark> items = new ArrayList<LandMark>();


    @NonNull
    @Override
    public LandmarkAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_landmark, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull LandmarkAdapter.ViewHolder holder, int position) {
        LandMark item = items.get(position);
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
    public void addItem(LandMark item) {
        items.add(item);
    }

    public void setItems(ArrayList<LandMark> items) {
        this.items = items;
    }

    public LandMark getItem(int position) {
        return items.get(position);
    }

    public void setItem(int position, LandMark item) {
        items.set(position, item);
    }



    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageLandMark;
        TextView textName, textCreateBy ,textstory;
        RatingBar ratingBar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageLandMark = itemView.findViewById(R.id.imageLandMark);
            textName = itemView.findViewById(R.id.textName);
            textCreateBy = itemView.findViewById(R.id.textCreateBy);
            textstory = itemView.findViewById(R.id.textstory);
            ratingBar = itemView.findViewById(R.id.ratingBar);
        }

        public void setItem(LandMark item) {
            imageLandMark.setImageResource(item.image);
            textName.setText(item.name);
            textCreateBy.setText(item.createdBy);
            textstory.setText(item.story);
            ratingBar.setRating(item.rating);
        }
    }
}
