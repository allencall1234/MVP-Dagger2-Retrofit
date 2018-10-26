package com.dagger.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import javax.inject.Inject;
import javax.inject.Named;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Inject
    @LilyFlower
    Pot lily;

    @Inject
    @LilyFlower
    Pot lily2;

    @Inject
    @RoseFlower
    Pot rose;

    @Inject
    @RoseFlower
    Pot rose2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaggerMainActivityComponent.builder()
                .potComponent(DaggerPotComponent.builder()
                        .flowerComponent(DaggerFlowerComponent.create())
                        .build())
                .build().bind(this);
        Toast.makeText(this, lily.show() + ":" + rose.show(), Toast.LENGTH_SHORT).show();
        Log.d("MainActivity", "Lily = " + lily + ",Lily2 = " + lily2);
        Log.d("MainActivity", "Rose = " + rose + ",Rose2 = " + rose2);
    }
}
