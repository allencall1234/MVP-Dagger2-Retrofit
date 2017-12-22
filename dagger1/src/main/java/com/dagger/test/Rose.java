package com.dagger.test;

import javax.inject.Inject;

/**
 * Created by 524202 on 2017/12/22.
 */

public class Rose {

    @Inject
    public Rose() {
    }

    public String whisper() {
        return "热恋";
    }
}
