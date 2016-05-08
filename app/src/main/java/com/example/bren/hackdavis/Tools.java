package com.example.bren.hackdavis;

import android.support.v4.app.Fragment;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.example.bren.hackdavis.R.layout.find_tutor;

/**
 * Created by Daanish on 5/8/2016.
 */
public class Tools extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.tools, container, false);
    }
    private void doMySearch(String query){

    }
}
