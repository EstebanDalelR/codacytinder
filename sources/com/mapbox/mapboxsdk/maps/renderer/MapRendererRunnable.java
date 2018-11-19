package com.mapbox.mapboxsdk.maps.renderer;

class MapRendererRunnable implements Runnable {
    private final long nativePtr;

    private native void nativeInitialize();

    protected native void finalize() throws Throwable;

    public native void run();

    MapRendererRunnable(long j) {
        this.nativePtr = j;
    }
}
