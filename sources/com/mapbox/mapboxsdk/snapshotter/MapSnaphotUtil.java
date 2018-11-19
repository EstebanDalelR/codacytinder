package com.mapbox.mapboxsdk.snapshotter;

import android.graphics.BitmapFactory.Options;

class MapSnaphotUtil {
    MapSnaphotUtil() {
    }

    static int calculateInSampleSize(Options options, int i, int i2) {
        int i3 = options.outHeight;
        options = options.outWidth;
        int i4 = 1;
        if (i3 > i2 || options > i) {
            i3 /= 2;
            options /= 2;
            while (i3 / i4 >= i2 && options / i4 >= i) {
                i4 *= 2;
            }
        }
        return i4;
    }
}
