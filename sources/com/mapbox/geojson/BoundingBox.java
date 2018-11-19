package com.mapbox.geojson;

import android.support.annotation.FloatRange;
import android.support.annotation.NonNull;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.mapbox.geojson.AutoValue_BoundingBox.GsonTypeAdapter;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import java.io.Serializable;
import java.lang.reflect.Type;

@AutoValue
public abstract class BoundingBox implements Serializable {
    @NonNull
    public abstract Point northeast();

    @NonNull
    public abstract Point southwest();

    public static BoundingBox fromJson(String str) {
        return (BoundingBox) new GsonBuilder().registerTypeAdapterFactory(GeoJsonAdapterFactory.create()).create().fromJson(str, BoundingBox.class);
    }

    public static BoundingBox fromPoints(@NonNull Point point, @NonNull Point point2) {
        return new AutoValue_BoundingBox(point, point2);
    }

    public static BoundingBox fromCoordinates(@FloatRange(from = -180.0d, to = 180.0d) double d, @FloatRange(from = -90.0d, to = 90.0d) double d2, @FloatRange(from = -180.0d, to = 180.0d) double d3, @FloatRange(from = -90.0d, to = 90.0d) double d4) {
        return new AutoValue_BoundingBox(Point.fromLngLat(d, d2), Point.fromLngLat(d3, d4));
    }

    public static BoundingBox fromCoordinates(@FloatRange(from = -180.0d, to = 180.0d) double d, @FloatRange(from = -90.0d, to = 90.0d) double d2, double d3, @FloatRange(from = -180.0d, to = 180.0d) double d4, @FloatRange(from = -90.0d, to = 90.0d) double d5, double d6) {
        return new AutoValue_BoundingBox(Point.fromLngLat(d, d2, d3), Point.fromLngLat(d4, d5, d6));
    }

    public final double west() {
        return southwest().longitude();
    }

    public final double south() {
        return southwest().latitude();
    }

    public final double east() {
        return northeast().longitude();
    }

    public final double north() {
        return northeast().latitude();
    }

    public static TypeAdapter<BoundingBox> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public final String toJson() {
        return new GsonBuilder().setPrettyPrinting().registerTypeAdapterFactory(GeoJsonAdapterFactory.create()).create().toJson((Object) this, (Type) BoundingBox.class);
    }
}
