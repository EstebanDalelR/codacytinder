package com.mapbox.geojson;

public interface GeoJson {
    BoundingBox bbox();

    String toJson();

    String type();
}
