package com.mapbox.mapboxsdk.style.sources;

public class CustomGeometrySourceOptions extends GeoJsonOptions {
    public CustomGeometrySourceOptions withWrap(boolean z) {
        put("wrap", Boolean.valueOf(z));
        return this;
    }

    public CustomGeometrySourceOptions withClip(boolean z) {
        put("clip", Boolean.valueOf(z));
        return this;
    }
}
