package com.example.tourguide;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class StreetFoodFragment extends Fragment {

    public StreetFoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_street_food, container, false);


        ArrayList<Block> block = new ArrayList<>();

        block.add(new Block(R.drawable.streetfood1, "Jamaal Tea Shop", 23.25871f, 77.40563f));
        block.add(new Block(R.drawable.streetfood2, "Chatori Gali", 23.25538f, 77.40299f));
        block.add(new Block(R.drawable.streetfood3, "Kalyan's Swaad Bhandaar", 23.25881f, 77.40272f));
        block.add(new Block(R.drawable.streetfood4, "Raju Tea Stall", 23.25863f, 77.40269f));
        block.add(new Block(R.drawable.streetfood5, "Kebabs at Jameel", 23.25635f, 77.40192f));

        BlockAdapter adapter = new BlockAdapter(getActivity(), block);

        ListView listView = (ListView) rootView.findViewById(R.id.streetfoodlist);

        listView.setAdapter(adapter);
        

        return rootView;
    }


}