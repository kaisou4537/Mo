package com.example.app;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        actionBar.addTab(actionBar.newTab().setText("Tab1").setTabListener(
                new MainTabListener<MainFragmentView>(
                        this, "flag1", MainFragmentView.class
                )
        ));

        actionBar.addTab(actionBar.newTab().setText("Tab2").setTabListener(
                new MainTabListener<SubFragmentView>(
                        this, "flag2", SubFragmentView.class
                )
        ));

    }
}
