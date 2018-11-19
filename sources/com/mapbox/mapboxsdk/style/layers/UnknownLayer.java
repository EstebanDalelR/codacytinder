package com.mapbox.mapboxsdk.style.layers;

import android.support.annotation.UiThread;

@UiThread
public class UnknownLayer extends Layer {
    protected native void finalize() throws Throwable;

    protected native void initialize();

    UnknownLayer(long j) {
        super(j);
    }
}
