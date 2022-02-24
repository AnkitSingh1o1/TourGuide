package com.example.tourguide;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;

import java.util.ArrayList;

public class AccommodationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_accommodation);

        // Define ActionBar object
        ActionBar actionBar;
        actionBar = getSupportActionBar();

        // Define ColorDrawable object and parse color
        // using parseColor method
        // with color hash code as its parameter
        @SuppressLint("Range") ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#16253E"));

        // Set BackgroundDrawable
        actionBar.setBackgroundDrawable(colorDrawable);

        //Create array of words
        ArrayList<Block> block = new ArrayList<>();
        //Word w = new Word("one","tutti");
        //words.add(w);     OR we can write
        block.add(new Block("#1",R.drawable.picture1,"Jehan Numa","4.9/5", 23.24089f, 77.38778f));
        block.add(new Block("#2",R.drawable.picture4,"Courtyard","4.5/5", 23.233347f, 77.43006f));
        block.add(new Block("#3",R.drawable.picture2,"Sayaji Hotel","4.2/5", 23.37329f, 77.67516f));
        block.add(new Block("#4",R.drawable.picture3,"Taj Lake Front","4.0/5", 23.21574f, 77.38318f));
        block.add(new Block("#5",R.drawable.picture5,"Blue Lagoon Farm","3.8/5", 23.22525f, 77.343211f));

        BlockAdapter adapter = new BlockAdapter(this, block);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}