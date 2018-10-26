package com.dagger.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {
    @Inject
    @LilyFlower
    Pot lily;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaggerSecondActivityComponent.builder()
                .potComponent(((App) getApplication()).getPotComponent())
                .build().bind(this);
        Log.d("MainActivity", "lily=" + lily);
    }
}
