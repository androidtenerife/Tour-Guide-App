package com.chaacho.tourguideapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.chaacho.tourguideapp.R;
import com.chaacho.tourguideapp.pojo.Shows;

import java.util.ArrayList;

public class ShowsAdapter extends ArrayAdapter<Shows> {
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Shows shows = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.card_show, parent, false);
        }
        // Lookup view for data population
        ImageView ivImage = convertView.findViewById(R.id.ivImage);
        TextView tvTitle = (TextView) convertView.findViewById(R.id.tvTitle);
        TextView tvShortDescription = convertView.findViewById(R.id.tvShortDescription);

        // Populate the data into the template view using the data object
        tvTitle.setText(shows.getNameOfShow());
        tvShortDescription.setText(shows.getShortDescription());
        ivImage.setImageResource(shows.getImageResource());
        //Not required go to Details.
        // Return the completed view to render on screen
        return convertView;
    }

    public ShowsAdapter(Context context, ArrayList<Shows>shows) {
        super(context, 0,shows);


    }
}
