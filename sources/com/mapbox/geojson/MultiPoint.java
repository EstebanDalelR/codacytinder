package com.mapbox.geojson;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.mapbox.geojson.AutoValue_MultiPoint.GsonTypeAdapter;
import com.mapbox.geojson.gson.BoundingBoxSerializer;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import com.mapbox.geojson.gson.PointDeserializer;
import com.mapbox.geojson.gson.PointSerializer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@AutoValue
public abstract class MultiPoint implements CoordinateContainer<List<Point>>, Serializable {
    private static final String TYPE = "MultiPoint";

    @Nullable
    public abstract BoundingBox bbox();

    @Nullable
    public abstract List<Point> coordinates();

    @NonNull
    public abstract String type();

    public static MultiPoint fromJson(@NonNull String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        gsonBuilder.registerTypeAdapter(Point.class, new PointDeserializer());
        return (MultiPoint) gsonBuilder.create().fromJson(str, MultiPoint.class);
    }

    public static MultiPoint fromLngLats(@NonNull List<Point> list) {
        return new AutoValue_MultiPoint(TYPE, null, list);
    }

    public static MultiPoint fromLngLats(@NonNull List<Point> list, @Nullable BoundingBox boundingBox) {
        return new AutoValue_MultiPoint(TYPE, boundingBox, list);
    }

    static MultiPoint fromLngLats(@NonNull double[][] dArr) {
        List arrayList = new ArrayList(dArr.length);
        for (double[] fromLngLat : dArr) {
            arrayList.add(Point.fromLngLat(fromLngLat));
        }
        return new AutoValue_MultiPoint(TYPE, null, arrayList);
    }

    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Point.class, new PointSerializer());
        gsonBuilder.registerTypeAdapter(BoundingBox.class, new BoundingBoxSerializer());
        return gsonBuilder.create().toJson((Object) this);
    }

    public static TypeAdapter<MultiPoint> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }
}
