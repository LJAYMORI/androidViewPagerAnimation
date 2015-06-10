package com.ljaymori.sampleviewpageranimation;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class MyPagerAdpater extends FragmentStatePagerAdapter {

    private ArrayList<Fragment> items = new ArrayList<Fragment>();

    public MyPagerAdpater(FragmentManager fm) {
        super(fm);
    }

    public void setInitPages(ArrayList<Fragment> list) {
        items.clear();
        items.addAll(list);
    }

    @Override
    public Fragment getItem(int position) {
        return items.get(position);
    }

    @Override
    public int getCount() {
        return items.size();
    }

}
