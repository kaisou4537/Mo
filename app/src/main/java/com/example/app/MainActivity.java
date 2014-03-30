package com.example.app;

import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.os.Bundle;
import android.app.Fragment;
import com.example.app.MainFragmentView;

public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        final ActionBar actionBar = getActionBar();
//        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
//
//        actionBar.addTab(actionBar.newTab().setText("Tab1").setTabListener(
//                new MainTabListener<MainFragmentView>(
//                        this, "flag1", MainFragmentView.class
//                )
//        ));
//
//        actionBar.addTab(actionBar.newTab().setText("Tab2").setTabListener(
//                new MainTabListener<SubFragmentView>(
//                        this, "flag2", SubFragmentView.class
//                )
//        ));

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




//        ActionBar ab = getSupportActionBar();
//        ab.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
//        ab.addTab(ab.newTab().setText("Tab1").setTabListener());


//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction()
//                    .add(R.id.container, new PlaceholderFragment())
//                    .commit();
//        }
    }



//    /**
//     * A placeholder fragment containing a simple view.
//     */
//    public static class PlaceholderFragment extends Fragment {
//
//        public PlaceholderFragment() {
//        }
//
//        @Override
//        public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                Bundle savedInstanceState) {
//            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
//            return rootView;
//        }
//    }

}
