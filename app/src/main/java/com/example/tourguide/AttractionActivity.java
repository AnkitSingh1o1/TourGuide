package com.example.tourguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class AttractionActivity extends AppCompatActivity {

    private TabLayout tabLayout2;
    private ViewPager viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction);

        tabLayout2 = findViewById(R.id.tablayout2);
        viewPager2 = findViewById(R.id.viewpager_attraction);

        tabLayout2.setupWithViewPager(viewPager2);

//        VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
//        vpAdapter.addFragment(new LakesFragment(), "Lakes");
//        vpAdapter.addFragment(new ReligiousPlacesFragment(), "Religious Places");
//        vpAdapter.addFragment(new FortFragment(), "Fort");

       // viewPager2.setAdapter(vpAdapter);
    }
}