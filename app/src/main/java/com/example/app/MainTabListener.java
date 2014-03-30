package com.example.app;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.Fragment;

public class MainTabListener<T extends Fragment> implements TabListener {

    private Fragment mFragment;
    private final Activity mActivity;
    private final String tag;
    private final Class<T> cls;

    public MainTabListener(
            Activity activity, String tag, Class<T> cls){
        mActivity = activity;
        this.tag = tag;
        this.cls = cls;
    }

    @Override
    public void onTabReselected(Tab tab, FragmentTransaction ft) {
    }

    @Override
    public void onTabSelected(Tab tab, FragmentTransaction ft) {
        if(mFragment == null){
            mFragment = Fragment.instantiate(mActivity, cls.getName());
            ft.add(android.R.id.content, mFragment, tag);
        }
        else{
            ft.attach(mFragment);
        }
    }

    @Override
    public void onTabUnselected(Tab tab, FragmentTransaction ft) {
        if(mFragment != null){
            ft.detach(mFragment);
        }
    }
}
