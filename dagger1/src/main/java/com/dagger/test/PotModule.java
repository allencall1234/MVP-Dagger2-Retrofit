package com.dagger.test;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by 524202 on 2017/12/21.
 */
@Module
public class PotModule {
    @Provides
    @Singleton
    Pot providePot(@PeonyFlower Flower flower) {
        return new Pot(flower);
    }
}
