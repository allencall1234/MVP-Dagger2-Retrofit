package com.dagger.test;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by 524202 on 2017/12/21.
 */

public class Pot {

    private Flower flower;

    @Inject
    public Pot(@Named("peony") Flower flower) {
        this.flower = flower;
    }

    public String show() {
        return flower.whisper();
    }
}
