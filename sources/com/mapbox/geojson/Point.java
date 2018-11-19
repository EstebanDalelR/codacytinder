package com.mapbox.geojson;

import android.support.annotation.FloatRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.mapbox.geojson.AutoValue_Point.GsonTypeAdapter;
import com.mapbox.geojson.gson.BoundingBoxDeserializer;
import com.mapbox.geojson.gson.BoundingBoxSerializer;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@AutoValue
public abstract class Point implements CoordinateContainer<List<Double>>, Serializable {
    private static final String TYPE = "Point";

    @Nullable
    public abstract BoundingBox bbox();

    @NonNull
    public abstract List<Double> coordinates();

    @NonNull
    public abstract String type();

    public static Point fromJson(@NonNull String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        gsonBuilder.registerTypeAdapter(BoundingBox.class, new BoundingBoxDeserializer());
        return (Point) gsonBuilder.create().fromJson(str, Point.class);
    }

    public static Point fromLngLat(@FloatRange(from = -180.0d, to = 180.0d) double d, @FloatRange(from = -90.0d, to = 90.0d) double d2) {
        return new AutoValue_Point(TYPE, null, Arrays.asList(new Double[]{Double.valueOf(d), Double.valueOf(d2)}));
    }

    public static Point fromLngLat(@FloatRange(from = -180.0d, to = 180.0d) double d, @FloatRange(from = -90.0d, to = 90.0d) double d2, @Nullable BoundingBox boundingBox) {
        return new AutoValue_Point(TYPE, boundingBox, Arrays.asList(new Double[]{Double.valueOf(d), Double.valueOf(d2)}));
    }

    public static Point fromLngLat(@FloatRange(from = -180.0d, to = 180.0d) double d, @FloatRange(from = -90.0d, to = 90.0d) double d2, double d3) {
        return new AutoValue_Point(TYPE, null, Arrays.asList(new Double[]{Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3)}));
    }

    public static Point fromLngLat(@FloatRange(from = -180.0d, to = 180.0d) double d, @FloatRange(from = -90.0d, to = 90.0d) double d2, double d3, @Nullable BoundingBox boundingBox) {
        return new AutoValue_Point(TYPE, boundingBox, Arrays.asList(new Double[]{Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3)}));
    }

    static Point fromLngLat(@NonNull double[] dArr) {
        if (dArr.length == 2) {
            return fromLngLat(dArr[0], dArr[1]);
        }
        return dArr.length > 2 ? fromLngLat(dArr[0], dArr[1], dArr[2]) : null;
    }

    public double longitude() {
        return ((Double) coordinates().get(0)).doubleValue();
    }

    public double latitude() {
        return ((Double) coordinates().get(1)).doubleValue();
    }

    public double altitude() {
        if (coordinates().size() < 3) {
            return Double.NaN;
        }
        return ((Double) coordinates().get(2)).doubleValue();
    }

    public boolean hasAltitude() {
        return Double.isNaN(altitude()) ^ 1;
    }

    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(BoundingBox.class, new BoundingBoxSerializer());
        return gsonBuilder.create().toJson((Object) this);
    }

    public static TypeAdapter<Point> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }
}
