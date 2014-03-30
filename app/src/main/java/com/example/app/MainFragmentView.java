package com.example.app;

import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainFragmentView extends Fragment{

    private TextView textView;

    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState){

        View view = (RelativeLayout)inflater.inflate(R.layout.fragment_main, container, false);
        textView = (TextView)view.findViewById(R.id.test_textfield);
        textView.setText("text test");
        Button button = (Button)view.findViewById(R.id.test_button);
        button.setText("change text!");

        button.setOnClickListener(button1onClickListener);

        return view;
    }

    View.OnClickListener button1onClickListener = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            changeShowText("button click now!");
        }
    };


    public void changeShowText(String str){
        textView.setText(str);
    }

}
