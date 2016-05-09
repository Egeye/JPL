package com.octavio.jpl.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.octavio.jpl.R;

/**
 * Created by Octavio on 2016/5/4.
 */
public class Main1Fragment extends Fragment {

    private View fragmentView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentView = inflater.inflate(R.layout.fragment_main_1, container, false);

        return fragmentView;
    }
}
