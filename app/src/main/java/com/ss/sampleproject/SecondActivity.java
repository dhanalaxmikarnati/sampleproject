package com.ss.sampleproject;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.ss.sampleproject.fragments.GalleryFragment;
import com.ss.sampleproject.fragments.HomeFragment;
import com.ss.sampleproject.fragments.VideosFragment;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private FrameLayout content_frame;
    private Button btn_home;
    private Button btn_videos;
    private Button btn_gallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initUI();
    }

    private void initUI() {
        content_frame = (FrameLayout) findViewById(R.id.content_frame);
        btn_home = (Button) findViewById(R.id.btn_home);
        btn_videos = (Button) findViewById(R.id.btn_videos);
        btn_gallery = (Button) findViewById(R.id.btn_gallery);

        btn_home.setOnClickListener(this);
        btn_videos.setOnClickListener(this);
        btn_gallery.setOnClickListener(this);

        navigate(new HomeFragment(), HomeFragment.TAG);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_home:
                navigate(new HomeFragment(), HomeFragment.TAG);
                break;
            case R.id.btn_videos:
                navigate(new VideosFragment(), VideosFragment.TAG);
                break;
            case R.id.btn_gallery:
                navigate(new GalleryFragment(), GalleryFragment.TAG);
                break;
        }
    }

    private void navigate(Fragment fragment, String tag) {
        FragmentManager fragmentManager = this.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();
        /*if (bundle != null) {
            fragment.setArguments(bundle);
        }*/
        fragmentTransaction.replace(R.id.content_frame, fragment, tag);
        fragmentTransaction.addToBackStack(tag);
        fragmentTransaction.commit();
    }


}
