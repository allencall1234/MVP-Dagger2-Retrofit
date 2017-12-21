package com.dagger.test;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by 524202 on 2017/12/21.
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface PeonyFlower {}
