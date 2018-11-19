package com.mapbox.geojson;

import android.support.annotation.NonNull;
import com.google.gson.GsonBuilder;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import com.mapbox.geojson.gson.GeometryDeserializer;
import com.mapbox.geojson.gson.PointDeserializer;

public abstract /* synthetic */ class Geometry$$CC {
    public static Geometry fromJson$$STATIC$$(@NonNull String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        gsonBuilder.registerTypeAdapter(Point.class, new PointDeserializer());
        gsonBuilder.registerTypeAdapter(Geometry.class, new GeometryDeserializer());
        return (Geometry) gsonBuilder.create().fromJson(str, Geometry.class);
    }
}
