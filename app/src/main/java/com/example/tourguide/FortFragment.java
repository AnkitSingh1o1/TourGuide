package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class FortFragment extends Fragment {


    public FortFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_fort, container, false);

        ArrayList<Block> block = new ArrayList<>();

        block.add(new Block(R.drawable.fort1, "Shaukat Mahal", 23.25655f, 77.39757f));
        block.add(new Block(R.drawable.fort2, "Gauhar Mahal", 23.254942776798462f, 77.39797206826535f));
        block.add(new Block(R.drawable.fort3, "Taj Mahal Palace", 23.250004605504106f, 77.416663307845f));
        block.add(new Block(R.drawable.fort4, "Rani Kamlapati", 23.25065397737199f, 77.39747906214255f));
        block.add(new Block(R.drawable.fort5, "Islamic Gate", 23.270238792388916f, 77.39627396929968f));

        BlockAdapter adapter = new BlockAdapter(getActivity(), block);

        ListView listView = (ListView) rootView.findViewById(R.id.fortslist);

        listView.setAdapter(adapter);


        return rootView;
    }
}