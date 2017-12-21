package com.dagger.test;

import javax.inject.Inject;

/**
 * Created by 524202 on 2017/12/21.
 */

public class Peony extends Flower {

    @Inject public Peony(){}

    @Override
    public String whisper() {
        return "富贵";
    }
}
