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
import com.chaacho.tourguideapp.pojo.Beaches;
import com.chaacho.tourguideapp.pojo.Cities;

import java.util.ArrayList;

public class CitiesAdapter extends ArrayAdapter<Cities> {
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Cities cities = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.card_city, parent, false);
        }
        // Lookup view for data population
        ImageView ivImage = convertView.findViewById(R.id.ivImage);
        TextView tvTitle = (TextView) convertView.findViewById(R.id.tvTitle);
        TextView tvShortDescription = convertView.findViewById(R.id.tvShortDescription);

        // Populate the data into the template view using the data object
        tvTitle.setText(cities.getNameInCity());
        tvShortDescription.setText(cities.getShortDescription());
        ivImage.setImageResource(cities.getSourceImage());
        //Not required go to Details.
        // Return the completed view to render on screen
        return convertView;
    }

    public CitiesAdapter(Context context, ArrayList<Cities>cities) {
        super(context, 0,cities);


    }
}
