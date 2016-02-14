package com.krellthehuman.welovethiscity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class WeLoveThisCity extends Activity
{
    private ImageView _loadingTitle;
    private View.OnClickListener _droidTapListener;

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title);

        initializeApp();
    }

    private void initializeApp() {
        _loadingTitle = (ImageView) findViewById(R.id.titleImageView);

        _droidTapListener = new View.OnClickListener() {
            public void onClick(View v) {
                TapDroid();
            }
        };
        _loadingTitle.setOnClickListener(_droidTapListener);
    }

    private void TapDroid() {
        setContentView(R.layout.main);
        System.out.println("title logo tapped. going to main.");
    }
}
