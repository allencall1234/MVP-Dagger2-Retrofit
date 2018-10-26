package com.dagger.test;

import dagger.Component;

@Component(modules = PotModule.class, dependencies = FlowerComponent.class)
public interface PotComponent {

    @LilyFlower
    Pot getLilyPot();

    @RoseFlower
    Pot getRosePot();
}
