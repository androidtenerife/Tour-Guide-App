package com.chaacho.tourguideapp.ui.show;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.chaacho.tourguideapp.R;
import com.chaacho.tourguideapp.adapter.ShowsAdapter;
import com.chaacho.tourguideapp.pojo.Shows;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Show#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Show extends Fragment {
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    //private static final String ARG_PARAM1 = "param1";
    //private static final String ARG_PARAM2 = "param2";

    //private String mParam1;
    //private String mParam2;

    public Show() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        populateShows();


    }

    public static Show newInstance(String param1, String param2) {
        Show fragment = new Show();
        Bundle args = new Bundle();
        //args.putString(ARG_PARAM1, param1);
        //args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
          //  mParam1 = getArguments().getString(ARG_PARAM1);
           // mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_show, container, false);
    }
    private void populateShows() {
        // Construct the data source
        View v = getView();
        ArrayList<Shows> arrayOfShows = Shows.loadShows();
        // Create the adapter to convert the array to views
        ShowsAdapter adapter = new ShowsAdapter(getContext(), arrayOfShows);
        // Attach the adapter to a ListView
        ListView listView = v.findViewById(R.id.lvShows);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
