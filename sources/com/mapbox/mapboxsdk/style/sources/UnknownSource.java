package com.mapbox.mapboxsdk.style.sources;

import android.support.annotation.UiThread;

@UiThread
public class UnknownSource extends Source {
    protected native void finalize() throws Throwable;

    protected native void initialize();

    UnknownSource(long j) {
        super(j);
    }
}
