package com.sdr.sharedtransitions;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Slide;
import android.view.Window;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);

            Slide slide = new Slide();
            slide.setDuration(2000);

            getWindow().setEnterTransition(slide);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_two);
    }
}
