package com.example.tourguide;

import android.app.Activity;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class BlockAdapter extends ArrayAdapter<Block> {
    public BlockAdapter(Activity context, ArrayList<Block> block) {
        super(context, 0, block);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }


        Block currBlock = getItem(position);

        //Set Image View of Hotel
        ImageView hotelImageView = (ImageView) listItemView.findViewById(R.id.image_view);
        hotelImageView.setImageResource(currBlock.getmHotelImageId());

        //Set Hotel name text View
        TextView hotelNameTextView = (TextView) listItemView.findViewById(R.id.hotel_name);
        hotelNameTextView.setText(currBlock.getmHotelName());

        //Set Hotel rating text view
        TextView hotelRatingTextView = (TextView) listItemView.findViewById(R.id.hotel_rating);
        hotelRatingTextView.setText(currBlock.getmHotelRating());


        return listItemView;
    }
}
