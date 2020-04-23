package com.chaacho.tourguideapp.ui.city;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.chaacho.tourguideapp.R;
import com.chaacho.tourguideapp.adapter.CitiesAdapter;
import com.chaacho.tourguideapp.pojo.Cities;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link City#newInstance} factory method to
 * create an instance of this fragment.
 */
public class City extends Fragment {

    public City() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        populateCity();
    }

    private void populateCity() {
        // Construct the data source
        View v = getView();
        ArrayList<Cities> arrayOfCity = Cities.loadCity();
        // Create the adapter to convert the array to views
        CitiesAdapter adapter = new CitiesAdapter(getContext(), arrayOfCity);
        // Attach the adapter to a ListView
        ListView listView = v.findViewById(R.id.lvCities);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Log.i("TAP", "Has Tapeado en " + id + " ID ");
                //detailSong(id);

            }
        });
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment City.
     */
    public static City newInstance(String param1, String param2) {
        City fragment = new City();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_city, container, false);
    }
}
