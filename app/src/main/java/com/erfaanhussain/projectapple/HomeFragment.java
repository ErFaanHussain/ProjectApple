package com.erfaanhussain.projectapple;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by erfaanhussain on 21/01/18.
 */

public class HomeFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        getActivity().setTitle(R.string.title_home);
        return inflater.inflate(R.layout.fragment_home, container, false);

    }

//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        getActivity().setTitle(R.string.title_home);
//    }
    }