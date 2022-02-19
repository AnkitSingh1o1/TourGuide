package com.example.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//-------------setting on click listener and calling intent to open respective classes--------------

        TextView accommodation = (TextView) findViewById(R.id.accommodation);
        accommodation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent accommodationIntent = new Intent(MainActivity.this,
                        AccommodationActivity.class);
                //start the new Activity
                startActivity(accommodationIntent);
            }
        });

        TextView attraction = (TextView) findViewById(R.id.attraction);
        attraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent attractionIntent = new Intent(MainActivity.this,
                        AttractionActivity.class);
                //start the new Activity
                startActivity(attractionIntent);
            }
        });

        TextView food = (TextView) findViewById(R.id.food);
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent foodIntent = new Intent(MainActivity.this,
                        FoodActivity.class);
                //start the new Activity
                startActivity(foodIntent);
            }
        });

        TextView shopping = (TextView) findViewById(R.id.shopping);
        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shoppingIntent = new Intent(MainActivity.this,
                        ShoppingActivity.class);
                //start the new Activity
                startActivity(shoppingIntent);
            }
        });
//--------------------All listeners created---------------------------------------------------------

        

    }
}