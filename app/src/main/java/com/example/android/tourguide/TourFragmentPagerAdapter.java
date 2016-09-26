package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by nicolaslacaze on 11/08/16.
 */
public class TourFragmentPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[] { "Short", "Medium", "Long", "Escape" };


    public TourFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem (int position) {
        if (position == 0) {
            return new ShortTripFragment();
        } else if (position == 1){
            return new MediumTripFragment();
        } else if (position == 2) {
            return new AdvancedTripFragment();
        } else {
            return new LongEscapeFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
