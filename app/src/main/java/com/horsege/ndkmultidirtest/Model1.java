package com.horsege.ndkmultidirtest;

/**
 * Created by mamingzhang on 2017/8/25.
 */

public class Model1 {
    static {
        System.loadLibrary("model1");
    }

    public native String getModelName();

}
