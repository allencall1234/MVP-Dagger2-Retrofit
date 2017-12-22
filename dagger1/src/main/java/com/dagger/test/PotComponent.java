package com.dagger.test;

import dagger.Component;

/**
 * Created by 524202 on 2017/12/22.
 */

@Component(modules = PotModule.class, dependencies = FlowerComponent.class)
public interface PotComponent {
    Pot getPot();
}
