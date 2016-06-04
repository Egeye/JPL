package com.octavio.jpl.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import com.octavio.jpl.R;

/**
 * Created by Octavio on 2016/5/4.
 */
public class Main1Fragment extends Fragment {

    private View fragmentView;

    private static String[] katakana1 = {
            "ア", "イ", "ウ", "エ", "オ",
            "カ", "キ", "ク", "ケ", "コ",
            "サ", "シ", "ス", "セ", "ソ",
            "タ", "チ", "ツ", "テ", "ト",
            "ナ", "ニ", "ヌ", "ネ", "ノ",
            "ハ", "ヒ", "フ", "ヘ", "ホ",
            "マ", "ミ", "ム", "メ", "モ",
            "ラ", "リ", "ル", "レ", "ロ"
    };

    private static String[] katakana2 = {
            "ヤ", "ユ", "ヨ",
            "ワ", "ヲ",
            "ン"
    };

    private static String[] roma ={
            "a","i","u","e","o",
            "ka","ki","ku","ke","ko",
            "sa","shi","su","se","so",
            "ta","chi","tsu","te","to",
            "na","ni","nu","ne","no",
            "ha","hi","fu","he","ho",
            "ma","mi","mu","me","mo",
            "ra","ri","ru","re","ro",
    };

    private static String[] Hiragana = {

    };

    private GridView gv;
    private KanaAdapter kanaAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentView = inflater.inflate(R.layout.fragment_main_1, container, false);

        gv = (GridView) fragmentView.findViewById(R.id.gv_1);
        kanaAdapter = new KanaAdapter();
        gv.setAdapter(kanaAdapter);

        return fragmentView;
    }


    private class KanaAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return katakana1.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View view = View.inflate(getActivity(),R.layout.item_framgent1,null);
            TextView tvKatakana = (TextView) view.findViewById(R.id.tv_katakana);
            TextView tvHiragana = (TextView) view.findViewById(R.id.tv_hiragana);
            TextView tvRoma = (TextView) view.findViewById(R.id.tv_roma);

            tvKatakana.setText(katakana1[position]);
            tvRoma.setText(roma[position]);

            return view;
        }
    }
}
