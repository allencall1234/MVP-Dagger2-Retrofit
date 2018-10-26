package com.dagger.test;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class PotModule {


    @Provides
    @Singleton
    @LilyFlower
    Pot provideLily(@LilyFlower Flower flower) {
        return new Pot(flower);
    }

    @Provides
    @Singleton
    @RoseFlower
    Pot provideRose(@RoseFlower Flower flower) {
        return new Pot(flower);
    }

}
