package com.mapbox.geojson.gson;

import com.google.gson.TypeAdapterFactory;

public abstract class GeoJsonAdapterFactory implements TypeAdapterFactory {
    public static TypeAdapterFactory create() {
        return new AutoValueGson_GeoJsonAdapterFactory();
    }
}
