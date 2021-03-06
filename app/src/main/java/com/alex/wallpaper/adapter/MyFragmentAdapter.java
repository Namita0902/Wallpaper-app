package com.alex.wallpaper.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.alex.wallpaper.ui.CategoryFragment;
import com.alex.wallpaper.ui.TrendingFragment;
import com.alex.wallpaper.ui.RecentsFragment;

public class MyFragmentAdapter extends FragmentPagerAdapter {
    private Context mContext;



    public MyFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.mContext=context;
    }

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {

            return CategoryFragment.getInstance();

        }else if (position==1){
            return TrendingFragment.getInstance();

        }else if  (position==2){

            return RecentsFragment.getInstance();

        }else {
         return null;
        }
    }
    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String tupe= "";
        switch (position){

            case 0:
                tupe= "Category";
               break;
             case 1:
                tupe= "Trending";
                break;
             case 2:
                tupe= "Recents";
                break;
         }

      return tupe;
    }
}
