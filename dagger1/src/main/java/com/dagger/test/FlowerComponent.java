package com.dagger.test;

import dagger.Component;

/**
 * Created by 524202 on 2017/12/22.
 */

@Component(modules = FlowerModule.class)
public interface FlowerComponent {
    @RoseFlower
    Flower getRoseFlower();

    @PenoyFlower
    Flower getPenoyFlower();
}
