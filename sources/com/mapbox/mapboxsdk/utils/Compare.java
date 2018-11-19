package com.mapbox.mapboxsdk.utils;

public class Compare {
    public static int compare(int i, int i2) {
        return i < i2 ? -1 : i == i2 ? 0 : 1;
    }

    public static int compare(boolean z, boolean z2) {
        return z == z2 ? 0 : z ? 1 : -1;
    }
}
