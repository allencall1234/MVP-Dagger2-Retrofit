package com.dagger.test;

import dagger.Module;
import dagger.Provides;

/**
 * Created by 524202 on 2017/12/22.
 */

@Module
public class PotModule {
    @Provides
    Pot providePot(@PenoyFlower Flower flower){
        return new Pot(flower);
    }
}
