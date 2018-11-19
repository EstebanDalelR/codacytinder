package com.mapbox.mapboxsdk.maps.renderer.egl;

public class EGLConfigException extends RuntimeException {
    public EGLConfigException(String str) {
        super(str);
    }

    public EGLConfigException(String str, Throwable th) {
        super(str, th);
    }

    public EGLConfigException(Throwable th) {
        super(th);
    }
}
