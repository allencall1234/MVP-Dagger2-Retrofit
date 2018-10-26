package com.dagger.test;

import dagger.Module;
import dagger.Provides;

@Module
public class FlowerModule {

    @Provides
    @RoseFlower
    Flower provideRose(){
        return new Rose();
    }

    @Provides
    @LilyFlower
    Flower provideLily(){
        return new LiLy();
    }
}
