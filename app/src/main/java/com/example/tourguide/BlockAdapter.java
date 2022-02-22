package com.example.tourguide;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.Locale;

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

        //set Hotel Rank Text View
        TextView hotelRankTextView = (TextView) listItemView.findViewById(R.id.hotel_rank);
        if(currBlock.hasMHotelImageId()) {
            hotelRankTextView.setText(currBlock.getmHotelRank());

            hotelRankTextView.setVisibility(View.VISIBLE);
        }
        else{
            hotelRankTextView.setVisibility(View.GONE);
        }

        //Set Hotel rating text view
        TextView hotelRatingTextView = (TextView) listItemView.findViewById(R.id.hotel_rating);
        if(currBlock.hasMHotelImageId()) {
            hotelRatingTextView.setText(currBlock.getmHotelRating());

            hotelRatingTextView.setVisibility(View.VISIBLE);
        }
        else{
            hotelRankTextView.setVisibility(View.GONE);
        }


        //Set Image View of Hotel
        ImageView hotelImageView = (ImageView) listItemView.findViewById(R.id.image_view);
        hotelImageView.setImageResource(currBlock.getmHotelImageId());

        //Set Hotel name text View
        TextView hotelNameTextView = (TextView) listItemView.findViewById(R.id.hotel_name);
        hotelNameTextView.setText(currBlock.getmHotelName());


        //set action of floating action button;
        Button btn = (Button)listItemView.findViewById(R.id.map_button);
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Context context = v.getContext();
                String uri = String.format(Locale.ENGLISH, "geo:%f,%f", currBlock.getMlatitude(), currBlock.getMlongitude());
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                context.startActivity(intent);
            }
        });



        return listItemView;
    }
}
