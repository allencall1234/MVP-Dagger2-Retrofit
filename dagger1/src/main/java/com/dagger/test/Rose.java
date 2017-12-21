package com.dagger.test;

import javax.inject.Inject;

/**
 * Created by 524202 on 2017/12/21.
 */

public class Rose extends Flower {

    @Inject public Rose(){}

    @Override
    public String whisper() {
        return "热恋";
    }
}
