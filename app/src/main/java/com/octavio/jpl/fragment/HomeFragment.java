package com.octavio.jpl.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.octavio.jpl.R;
import com.octavio.jpl.adapter.FindPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Octavio on 2016/5/4.
 */
public class HomeFragment extends Fragment {

    private View fragmentView;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentView = inflater.inflate(R.layout.fragment_home, container, false);

        mTabLayout = (TabLayout) fragmentView.findViewById(R.id.sliding_tabs);
        mViewPager = (ViewPager) fragmentView.findViewById(R.id.viewpager);

        List<String> titles = new ArrayList<>();
        titles.add("基础假名");
        titles.add("浊音拗音");
        titles.add("特殊音节");

        FindPagerAdapter viewPagerAdapter = new FindPagerAdapter(getActivity(), titles, getChildFragmentManager());
        mViewPager.setAdapter(viewPagerAdapter);

        mTabLayout.setTabMode(TabLayout.MODE_FIXED);
        mTabLayout.addTab(mTabLayout.newTab().setText("基础假名"));
        mTabLayout.addTab(mTabLayout.newTab().setText("浊音拗音"));
        mTabLayout.addTab(mTabLayout.newTab().setText("特殊音节"));
        mTabLayout.setupWithViewPager(mViewPager);


        return fragmentView;
    }
}
