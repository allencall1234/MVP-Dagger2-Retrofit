package com.dagger.test;

import android.app.Application;

public class App extends Application {
    private PotComponent potComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        potComponent = DaggerPotComponent.builder().flowerComponent(
                DaggerFlowerComponent.create()
        ).build();
    }

    public PotComponent getPotComponent() {
        return potComponent;
    }
}
