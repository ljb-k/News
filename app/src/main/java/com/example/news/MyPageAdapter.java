package com.example.news;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by 日不落 on 2017/5/18.
 */

public class MyPageAdapter extends FragmentPagerAdapter{

    private ArrayList<NewsFragment> mFragmentArrayList;
    private ArrayList<String> mTitleList;

    public MyPageAdapter(FragmentManager fm,ArrayList<NewsFragment> mFragmentArrayList,ArrayList<String> mTitleList) {
        super(fm);
        this.mFragmentArrayList = mFragmentArrayList;
        this.mTitleList = mTitleList;
    }

    @Override
    public Fragment getItem(int position) {
        if(position < mFragmentArrayList.size()){
            return mFragmentArrayList.get(position);
        }
        return null;
    }

    @Override
    public int getCount() {
        if(mFragmentArrayList == null){
            return 0;
        }
        return mFragmentArrayList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(mTitleList != null && position < mTitleList.size()){
            return mTitleList.get(position);
        }
        return "notitle";
    }
}
