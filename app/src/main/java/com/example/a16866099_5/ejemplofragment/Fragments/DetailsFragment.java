package com.example.a16866099_5.ejemplofragment.Fragments;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.a16866099_5.ejemplofragment.R;

public class DetailsFragment extends Fragment {

    private TextView details;

    public DetailsFragment()
    {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_details,container,false);

        details = (TextView) view.findViewById(R.id.textViewDetails);

        return view;
    }


    public void renderText(String text )
    { details.setText(text);}
}
