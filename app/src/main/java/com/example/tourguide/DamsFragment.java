package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class DamsFragment extends Fragment {


    public DamsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.fragment_dams, container, false);

        ArrayList<Block> block = new ArrayList<>();

        block.add(new Block(R.drawable.dam1, "Bhadbhada Dam", 23.20839f, 77.37889f));
        block.add(new Block(R.drawable.dam2, "Halali Dam", 23.48473f, 77.50454f));
        block.add(new Block(R.drawable.dam3, "Kaliyasot Dam", 23.19822f, 77.38962f));
        block.add(new Block(R.drawable.dam4, "Kerwa Dam", 23.16473f, 77.37205f));
        block.add(new Block(R.drawable.dam5, "Kolar Dam", 23.96208f, 77.34113f));

        BlockAdapter adapter = new BlockAdapter(getActivity(), block);

        ListView listView = (ListView) rootView.findViewById(R.id.damslist);

        listView.setAdapter(adapter);

        return rootView;
    }
}