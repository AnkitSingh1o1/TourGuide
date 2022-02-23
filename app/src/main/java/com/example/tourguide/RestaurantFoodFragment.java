package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class RestaurantFoodFragment extends Fragment {

    public RestaurantFoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_restaurant_food, container, false);


        ArrayList<Block> block = new ArrayList<>();

        block.add(new Block(R.drawable.restaurant1, "MoMo Cafe", 23.23277f, 77.42989f));
        block.add(new Block(R.drawable.restaurant2, "Manohar Restaurant", 23.23414f, 77.43407f));
        block.add(new Block(R.drawable.restaurant3, "Indian Coffe House", 23.23074f, 77.43184f));
        block.add(new Block(R.drawable.restaurant4, "Bappu Ki Kutia", 23.23329f, 77.43357f));
        block.add(new Block(R.drawable.restaurant5, "Milan Restaurant", 23.23250f, 77.43360f));

        BlockAdapter adapter = new BlockAdapter(getActivity(), block);

        ListView listView = (ListView) rootView.findViewById(R.id.restaurantfoodlist);

        listView.setAdapter(adapter);

        return rootView;
    }
}