package com.example.app;

import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.textservice.TextInfo;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by ssk on 14/03/23.
 */
public class MainFragmentView extends Fragment{

    private TextView textView;
    private Activity activity;

    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState){

//        Button button = (Button)R.layout.test_button;
        View view = (RelativeLayout)inflater.inflate(R.layout.fragment_main, container, false);
//        activity = view.getActivity();
        textView = (TextView)view.findViewById(R.id.test_textfield);
        textView.setText("sakldjsdklajkflsjakldfjskl");
        Button button = (Button)view.findViewById(R.id.test_button);
        button.setText("hjoajkdelaskldj");

        button.setOnClickListener(button1onClickListener);

//        return inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }

    View.OnClickListener button1onClickListener = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            changeShowText("hogehogeoheogeoheoghe");
        }
    };


    public void changeShowText(String str){
        textView.setText(str);
    }

}
