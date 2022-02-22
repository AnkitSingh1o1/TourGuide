package com.example.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);

        ArrayList<Block> block = new ArrayList<>();

        block.add(new Block(R.drawable.market1, "Chowk Bazaar", 23.25913f, 77.40199f));
        block.add(new Block(R.drawable.market2, "Bittan Market", 23.21694f, 77.42692f));
        block.add(new Block(R.drawable.market3, "New Market", 23.23532f, 77.40038f));
        block.add(new Block(R.drawable.market4, "Sarafa Market", 23.26888f, 77.33846f));
        block.add(new Block(R.drawable.market5, "Habibganj Market", 23.26888f, 77.33846f));

        BlockAdapter adapter = new BlockAdapter(this, block);

        ListView listView = (ListView) findViewById(R.id.marketlist);

        listView.setAdapter(adapter);

    }
}