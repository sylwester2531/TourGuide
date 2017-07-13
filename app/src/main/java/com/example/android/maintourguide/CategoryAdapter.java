package com.example.android.maintourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by admin on 2017-07-13.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    /**
     * Context of the app
     */
    private Context mContext;
    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }
    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new VisitFragment();
        } else if (position == 1) {
            return new DrinkFragment();
        } else if (position == 2) {
            return new EatFragment();
        } else {
            return new SleepFragment();
        }
    }
    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_visit);
        } else if (position == 1) {
            return mContext.getString(R.string.category_drink);
        } else if (position == 2) {
            return mContext.getString(R.string.category_eat);
        } else {
            return mContext.getString(R.string.category_sleep);
        }
    }

}
