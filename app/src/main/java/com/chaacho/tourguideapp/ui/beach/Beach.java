package com.chaacho.tourguideapp.ui.beach;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.chaacho.tourguideapp.R;
import com.chaacho.tourguideapp.adapter.BeachesAdapter;
import com.chaacho.tourguideapp.adapter.WalkingTrailAdapter;
import com.chaacho.tourguideapp.pojo.Beaches;
import com.chaacho.tourguideapp.pojo.WalkingTrail;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Beach#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Beach extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Beach() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Beach.
     */
    // TODO: Rename and change types and number of parameters
    public static Beach newInstance(String param1, String param2) {
        Beach fragment = new Beach();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        populateBeaches();

    }
    private void populateBeaches() {
        // Construct the data source
        View v = getView();
        ArrayList<Beaches> arrayOfBeaches = Beaches.loadBeaches();
        // Create the adapter to convert the array to views
        BeachesAdapter adapter = new BeachesAdapter(getContext(), arrayOfBeaches);
        // Attach the adapter to a ListView
        ListView listView = v.findViewById(R.id.lvBeaches);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Log.i("TAP", "Has Tapeado en " + id + " ID ");
                //detailSong(id);

            }
        });
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_beach, container, false);
    }
}
