package com.mapbox.geojson;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.mapbox.geojson.AutoValue_LineString.GsonTypeAdapter;
import com.mapbox.geojson.gson.BoundingBoxDeserializer;
import com.mapbox.geojson.gson.BoundingBoxSerializer;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import com.mapbox.geojson.gson.PointDeserializer;
import com.mapbox.geojson.gson.PointSerializer;
import com.mapbox.geojson.utils.PolylineUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@AutoValue
public abstract class LineString implements CoordinateContainer<List<Point>>, Serializable {
    private static final String TYPE = "LineString";

    @Nullable
    public abstract BoundingBox bbox();

    @NonNull
    public abstract List<Point> coordinates();

    @NonNull
    public abstract String type();

    public static LineString fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        gsonBuilder.registerTypeAdapter(Point.class, new PointDeserializer());
        gsonBuilder.registerTypeAdapter(BoundingBox.class, new BoundingBoxDeserializer());
        return (LineString) gsonBuilder.create().fromJson(str, LineString.class);
    }

    public static LineString fromLngLats(@NonNull MultiPoint multiPoint) {
        return new AutoValue_LineString(TYPE, null, multiPoint.coordinates());
    }

    public static LineString fromLngLats(@NonNull List<Point> list) {
        return new AutoValue_LineString(TYPE, null, list);
    }

    public static LineString fromLngLats(@NonNull List<Point> list, @Nullable BoundingBox boundingBox) {
        return new AutoValue_LineString(TYPE, boundingBox, list);
    }

    public static LineString fromLngLats(@NonNull MultiPoint multiPoint, @Nullable BoundingBox boundingBox) {
        return new AutoValue_LineString(TYPE, boundingBox, multiPoint.coordinates());
    }

    static LineString fromLngLats(double[][] dArr) {
        List arrayList = new ArrayList(dArr.length);
        for (double[] fromLngLat : dArr) {
            arrayList.add(Point.fromLngLat(fromLngLat));
        }
        return fromLngLats(arrayList);
    }

    public static LineString fromPolyline(@NonNull String str, int i) {
        return fromLngLats(PolylineUtils.decode(str, i), (BoundingBox) 0);
    }

    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Point.class, new PointSerializer());
        gsonBuilder.registerTypeAdapter(BoundingBox.class, new BoundingBoxSerializer());
        return gsonBuilder.create().toJson((Object) this);
    }

    public String toPolyline(int i) {
        return PolylineUtils.encode(coordinates(), i);
    }

    public static TypeAdapter<LineString> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }
}
