package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ReligiousPlacesFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_religious_places, container, false);

        ArrayList<Block> block = new ArrayList<>();

        block.add(new Block(R.drawable.mandir1, "Birla Mandir", 23.23826135128265f, 77.40858939005358f));
        block.add(new Block(R.drawable.mandir2, "Khatlapura Temple", 23.249968338674105f, 77.41085346674059f));
        block.add(new Block(R.drawable.mandir3, "Gufa Mandir", 23.27623137538714f, 77.3762575404645f));
        block.add(new Block(R.drawable.mandir4, "Taj Ul Masjid", 23.26298790882262f, 77.39282209005424f));
        block.add(new Block(R.drawable.mandir5, "Manuabhan Tekri", 23.283253305037295f, 77.36417842780273f));

        BlockAdapter adapter = new BlockAdapter(getActivity(), block);

        ListView listView = (ListView) rootView.findViewById(R.id.religiousplaceslist);

        listView.setAdapter(adapter);

        return rootView;
    }
}