package com.octavio.jpl.utils;

import android.support.v4.app.Fragment;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Octavio on 2016/5/9.
 */
public class ViewTools {
    private static Map<String, Fragment> fragmentList = new HashMap<>();

    /**
     * 根据Class创建Fragment
     *
     * @param clazz the Fragment of create
     * @return
     */
    public static Fragment createFragment(Class<?> clazz, boolean isObtain) {
        Fragment resultFragment = null;
        String className = clazz.getName();
        if (fragmentList.containsKey(className)) {
            resultFragment = fragmentList.get(className);
        } else {
            try {
                try {
                    resultFragment = (Fragment) Class.forName(className).newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            if (isObtain)
                fragmentList.put(className, resultFragment);
        }

        return resultFragment;
    }

    public static Fragment createFragment(Class<?> clazz) {
        return createFragment(clazz, true);
    }
}
