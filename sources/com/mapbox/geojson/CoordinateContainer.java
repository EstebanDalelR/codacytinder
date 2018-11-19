package com.mapbox.geojson;

public interface CoordinateContainer<T> extends Geometry {
    T coordinates();
}
