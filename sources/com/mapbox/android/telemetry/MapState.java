package com.mapbox.android.telemetry;

public class MapState {
    private String gesture;
    private double latitude;
    private double longitude;
    private double zoom;

    public MapState(double d, double d2, double d3) {
        this.latitude = d;
        this.longitude = d2;
        this.zoom = d3;
    }

    public void setGesture(String str) {
        this.gesture = str;
    }

    String getGesture() {
        return this.gesture;
    }

    double getLatitude() {
        return this.latitude;
    }

    double getLongitude() {
        return this.longitude;
    }

    double getZoom() {
        return this.zoom;
    }
}
