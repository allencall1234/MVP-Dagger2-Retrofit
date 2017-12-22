package com.dagger.test;

import javax.inject.Inject;

/**
 * Created by 524202 on 2017/12/21.
 */

public class Pot {

    private Rose rose;

    @Inject
    public Pot(Rose flower) {
        this.rose = flower;
    }

    public String show() {
        return rose.whisper();
    }
}
