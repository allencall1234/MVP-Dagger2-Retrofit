package com.dagger.test;

import dagger.Component;

/**
 * Created by 524202 on 2017/12/21.
 */
@ActivityScope
@Component(dependencies = PotComponent.class)
public interface MainActivityComponent {
    void bind(MainActivity activity);
}
