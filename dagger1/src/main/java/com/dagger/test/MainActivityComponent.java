package com.dagger.test;

import dagger.Component;

/**
 * Created by 524202 on 2017/12/21.
 */
@Component(modules = {FlowerModule.class, PotModule.class})
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
