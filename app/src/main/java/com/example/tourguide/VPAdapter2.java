package com.example.tourguide;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class VPAdapter2 extends FragmentPagerAdapter {

    private Context mContext;

    public VPAdapter2(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new DamsFragment();
        } else if(position == 1){
            return new FortFragment();
        }
        else{
            return new ReligiousPlacesFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.DAMS);
        } else if(position == 1){
            return mContext.getString(R.string.FORT);
        }
        else{
            return mContext.getString(R.string.RELIGIOUSPLACES);
        }
    }
}
