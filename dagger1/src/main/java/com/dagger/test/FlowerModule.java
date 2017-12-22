package com.dagger.test;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * Created by 524202 on 2017/12/22.
 */

@Module
public class FlowerModule {
    @Provides
    @RoseFlower
    Flower provideRose() {
        return new Rose();
    }

    @Provides
    @PenoyFlower
    Flower providePeony() {
        return new Peony();
    }
}
