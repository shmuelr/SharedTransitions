package com.sdr.sharedtransitions;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // inside your activity (if you did not enable transitions in your theme)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton(View view) {
        Intent intent = new Intent(this, ActivityTwo.class);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
           View transView = findViewById(R.id.sharedView);
//            // create the transition animation - the images in the layouts
//            // of both activities are defined with android:transitionName="robot"
//            ActivityOptions options = null;
//                options = ActivityOptions
//                        .makeSceneTransitionAnimation(this, transView, "square");

            Explode explode = new Explode();
            explode.setDuration(2000);
            explode.excludeTarget(transView, true);

            getWindow().setExitTransition(explode);

            startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
        }else{
            startActivity(intent);
        }

    }
}
