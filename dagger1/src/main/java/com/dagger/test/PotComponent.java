package com.dagger.test;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by 524202 on 2017/12/21.
 */

@Singleton
@Component(modules = PotModule.class, dependencies = FlowerComponent.class)
public interface PotComponent {
    Pot getPot();
}
