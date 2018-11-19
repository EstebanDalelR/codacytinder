package com.mapbox.mapboxsdk.style.sources;

public abstract class Source {
    private long nativePtr;

    protected native String nativeGetAttribution();

    protected native String nativeGetId();

    public Source(long j) {
        this.nativePtr = j;
    }

    public String getId() {
        return nativeGetId();
    }

    public String getAttribution() {
        return nativeGetAttribution();
    }

    public long getNativePtr() {
        return this.nativePtr;
    }
}
