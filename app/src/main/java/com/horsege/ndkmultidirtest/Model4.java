package com.horsege.ndkmultidirtest;

/**
 * Created by mamingzhang on 2017/8/28.
 */

public class Model4 {
    static {
        System.loadLibrary("model4");
    }

    public native String getModelName();
}
