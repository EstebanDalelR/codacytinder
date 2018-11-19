package com.mapbox.mapboxsdk.maps.renderer;

public interface MapRendererScheduler {
    void queueEvent(Runnable runnable);

    void requestRender();
}
