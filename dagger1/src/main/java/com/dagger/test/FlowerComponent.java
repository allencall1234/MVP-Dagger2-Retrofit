package com.dagger.test;

import dagger.Component;

@Component(modules = FlowerModule.class)
public interface FlowerComponent {

    @RoseFlower
    Flower getRoseFlower();

    @LilyFlower
    Flower getLilyFlower();

}
