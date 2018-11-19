package com.tinder.utils;

public class Tinteg {
    public static String ali;
    public static String alt;

    public static native String tintegS(Class cls, Object obj);

    static {
        System.loadLibrary("tinteg");
    }
}
