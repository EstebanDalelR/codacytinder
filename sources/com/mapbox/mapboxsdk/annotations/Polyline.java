package com.mapbox.mapboxsdk.annotations;

import com.mapbox.mapboxsdk.maps.MapboxMap;

public final class Polyline extends BasePointCollection {
    private int color = -16777216;
    private float width = 10.0f;

    Polyline() {
    }

    public int getColor() {
        return this.color;
    }

    public float getWidth() {
        return this.width;
    }

    public void setColor(int i) {
        this.color = i;
        update();
    }

    public void setWidth(float f) {
        this.width = f;
        update();
    }

    void update() {
        MapboxMap mapboxMap = getMapboxMap();
        if (mapboxMap != null) {
            mapboxMap.updatePolyline(this);
        }
    }
}
