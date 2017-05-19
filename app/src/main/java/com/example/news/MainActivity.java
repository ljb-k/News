package com.example.news;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private MyPageAdapter mPageAdapter;
    private ArrayList<NewsFragment> mFragmentArrayList = new ArrayList<NewsFragment>();
    private ArrayList<String> mTitleList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFragmentArrayList();
        initTitleList();

        mTabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mPageAdapter = new MyPageAdapter(getSupportFragmentManager(),mFragmentArrayList,mTitleList);
        mViewPager.setAdapter(mPageAdapter);
        mTabLayout.setupWithViewPager(mViewPager);


    }

    private void initTitleList() {
        mTitleList.add("头条");
        mTitleList.add("娱乐");
        mTitleList.add("体育");
        mTitleList.add("科技");
        mTitleList.add("社会");
        mTitleList.add("军事");
        mTitleList.add("财经");
        mTitleList.add("时尚");

    }

    private void initFragmentArrayList() {
        NewsFragment fa = new NewsFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("NEWSTYPE",1);
        fa.setArguments(bundle);

        NewsFragment fb = new NewsFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("NEWSTYPE",2);
        fb.setArguments(bundle2);

        NewsFragment fc = new NewsFragment();
        Bundle bundle3 = new Bundle();
        bundle3.putInt("NEWSTYPE",3);
        fc.setArguments(bundle3);

        NewsFragment fd = new NewsFragment();
        Bundle bundle4 = new Bundle();
        bundle4.putInt("NEWSTYPE",4);
        fd.setArguments(bundle4);

        NewsFragment fe = new NewsFragment();
        Bundle bundle5 = new Bundle();
        bundle5.putInt("NEWSTYPE",5);
        fe.setArguments(bundle5);

        NewsFragment ff = new NewsFragment();
        Bundle bundle6 = new Bundle();
        bundle6.putInt("NEWSTYPE",6);
        ff.setArguments(bundle6);

        NewsFragment fg = new NewsFragment();
        Bundle bundle7 = new Bundle();
        bundle7.putInt("NEWSTYPE",7);
        fg.setArguments(bundle7);

        NewsFragment fh = new NewsFragment();
        Bundle bundle8 = new Bundle();
        bundle8.putInt("NEWSTYPE",8);
        fh.setArguments(bundle8);

        mFragmentArrayList.add(fa);
        mFragmentArrayList.add(fb);
        mFragmentArrayList.add(fc);
        mFragmentArrayList.add(fd);
        mFragmentArrayList.add(fe);
        mFragmentArrayList.add(ff);
        mFragmentArrayList.add(fg);
        mFragmentArrayList.add(fh);

    }
}
