package com.horsege.ndkmultidirtest;

/**
 * Created by mamingzhang on 2017/8/25.
 */

public class Model3 {
    static {
        System.loadLibrary("model3");
    }

    public native String getModelName();
}
