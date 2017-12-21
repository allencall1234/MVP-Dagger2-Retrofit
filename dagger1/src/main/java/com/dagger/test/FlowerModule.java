package com.dagger.test;

import dagger.Module;
import dagger.Provides;

/**
 * Created by 524202 on 2017/12/21.
 */
@Module
public class FlowerModule {
    @Provides
    @PeonyFlower
    Flower providePeony() {
        return new Peony();
    }

    @Provides
    @RoseFlower
    Flower provideRose() {
        return new Rose();
    }
}
