package com.dagger.test;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = PotModule.class, dependencies = FlowerComponent.class)
public interface PotComponent {

    @LilyFlower
    Pot getLilyPot();

    @RoseFlower
    Pot getRosePot();
}
