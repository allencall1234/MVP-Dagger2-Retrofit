package com.dagger.test;

import dagger.Module;
import dagger.Provides;

/**
 * Created by 524202 on 2017/12/22.
 */

@Module
public class FlowerModule {
    @Provides
    Flower provideFlower() {
        return new Rose();
    }
}
