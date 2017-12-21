package com.dagger.test;

import dagger.Component;

/**
 * Created by 524202 on 2017/12/21.
 */

@Component(modules = FlowerModule.class)
public interface FlowerComponent {
    @RoseFlower
    Flower getRoseFlower();

    @PeonyFlower
    Flower getPeonyFlower();
}
