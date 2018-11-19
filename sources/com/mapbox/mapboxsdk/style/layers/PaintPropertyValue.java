package com.mapbox.mapboxsdk.style.layers;

import android.support.annotation.NonNull;

class PaintPropertyValue<T> extends PropertyValue<T> {
    PaintPropertyValue(@NonNull String str, T t) {
        super(str, t);
    }
}
