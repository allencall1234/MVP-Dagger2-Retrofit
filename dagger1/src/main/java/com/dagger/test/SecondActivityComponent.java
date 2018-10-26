package com.dagger.test;

import dagger.Component;

@ActivityScope
@Component(dependencies = PotComponent.class)
public interface SecondActivityComponent {
    void bind(SecondActivity activity);
}
