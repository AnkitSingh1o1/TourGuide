package com.example.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AccommodationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accommodation);

        //Create array of words
        ArrayList<Block> block = new ArrayList<>();
        //Word w = new Word("one","tutti");
        //words.add(w);     OR we can write
        block.add(new Block(R.drawable.picture1,"Jehan Numa Palace","4.9/5"));
        block.add(new Block(R.drawable.picture4,"Courtyard by Marriott","4.5/5"));
        block.add(new Block(R.drawable.picture2,"Sayaji Hotel","4.2/5"));
        block.add(new Block(R.drawable.picture3,"Taj Lake Front Hotel","4.0/5"));
        block.add(new Block(R.drawable.picture5,"Blue Lagoon Farm","3.8/5"));

        BlockAdapter adapter = new BlockAdapter(this, block);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}