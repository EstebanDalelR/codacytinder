package com.mapbox.mapboxsdk.annotations;

import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import java.util.ArrayList;
import java.util.List;

public final class Polygon extends BasePointCollection {
    private int fillColor = -16777216;
    private List<List<LatLng>> holes = new ArrayList();
    private int strokeColor = -16777216;

    Polygon() {
    }

    public int getFillColor() {
        return this.fillColor;
    }

    public int getStrokeColor() {
        return this.strokeColor;
    }

    public List<List<LatLng>> getHoles() {
        return new ArrayList(this.holes);
    }

    public void setFillColor(int i) {
        this.fillColor = i;
        update();
    }

    public void setStrokeColor(int i) {
        this.strokeColor = i;
        update();
    }

    public void setHoles(List<? extends List<LatLng>> list) {
        this.holes = new ArrayList(list);
        update();
    }

    void addHole(List<LatLng> list) {
        this.holes.add(list);
        update();
    }

    void update() {
        MapboxMap mapboxMap = getMapboxMap();
        if (mapboxMap != null) {
            mapboxMap.updatePolygon(this);
        }
    }
}
