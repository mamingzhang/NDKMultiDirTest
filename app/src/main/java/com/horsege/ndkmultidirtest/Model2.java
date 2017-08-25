package com.horsege.ndkmultidirtest;

/**
 * Created by mamingzhang on 2017/8/25.
 */

public class Model2 {
    static {
        System.loadLibrary("model2");
    }

    public native String getModelName();
}
