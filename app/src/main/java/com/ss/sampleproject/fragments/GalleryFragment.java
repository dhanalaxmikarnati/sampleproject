package com.ss.sampleproject.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ss.sampleproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryFragment extends Fragment {
    public static String TAG = GalleryFragment.class.getName();

    private Bundle bundle;
    private String mNumber = "";

    private TextView tv_gallery;
    private View view;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bundle = getArguments();
        mNumber = bundle.getString("number");
        Log.d(TAG, mNumber);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_gallery, container, false);
        tv_gallery = view.findViewById(R.id.tv_gallery);
        tv_gallery.setText(mNumber);
        return view;
    }

}
