package com.mapbox.mapboxsdk.style.layers;

public class CustomLayer extends Layer {
    protected native void finalize() throws Throwable;

    protected native void initialize(String str, long j);

    protected native void nativeUpdate();

    public CustomLayer(String str, long j) {
        initialize(str, j);
    }

    public CustomLayer(long j) {
        super(j);
    }

    public void update() {
        nativeUpdate();
    }
}
