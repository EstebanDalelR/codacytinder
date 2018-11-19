package com.mapbox.mapboxsdk.utils;

public class MathUtils {
    public static double wrap(double d, double d2, double d3) {
        d3 -= d2;
        return ((((d - d2) % d3) + d3) % d3) + d2;
    }

    public static double clamp(double d, double d2, double d3) {
        return Math.max(d2, Math.min(d3, d));
    }

    public static float clamp(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }
}
