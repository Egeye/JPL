package com.octavio.jpl.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.octavio.jpl.fragment.Main1Fragment;
import com.octavio.jpl.fragment.Main2Fragment;
import com.octavio.jpl.fragment.Main3Fragment;
import com.octavio.jpl.utils.ViewTools;

import java.util.List;

/**
 * Created by Octavio on 2016/5/9.
 */
public class FindPagerAdapter extends FragmentPagerAdapter {


    private final List<String> mTitleList;
    private final Context mContext;

    public FindPagerAdapter(Context context, List<String> titles, FragmentManager fm) {
        super(fm);
        mContext = context;
        mTitleList = titles;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = createFragmentByTitle(mTitleList.get(position));
        return fragment;
    }

    @Override
    public int getCount() {
        return mTitleList.size();
    }

    private Fragment createFragmentByTitle(String title) {

        Fragment result = new Main1Fragment();//这里主要是一个防止没有找到Fragment，给一个默认
        if (title.equals("基础假名")) {
            result = ViewTools.createFragment(Main1Fragment.class, false);
        } else if (title.equals("浊音拗音")) {
            result = ViewTools.createFragment(Main2Fragment.class, false);
        } else if (title.equals("特殊音节")) {
            result = ViewTools.createFragment(Main3Fragment.class, false);
        }
        return result;

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitleList.get(position);
    }
}
