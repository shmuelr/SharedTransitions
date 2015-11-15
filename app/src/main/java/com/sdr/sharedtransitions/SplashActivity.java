package com.sdr.sharedtransitions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onResume() {
        super.onResume();
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
