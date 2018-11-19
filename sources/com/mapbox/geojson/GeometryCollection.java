package com.mapbox.geojson;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.mapbox.geojson.AutoValue_GeometryCollection.GsonTypeAdapter;
import com.mapbox.geojson.gson.BoundingBoxDeserializer;
import com.mapbox.geojson.gson.BoundingBoxSerializer;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import com.mapbox.geojson.gson.GeometryDeserializer;
import com.mapbox.geojson.gson.PointDeserializer;
import com.mapbox.geojson.gson.PointSerializer;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@AutoValue
public abstract class GeometryCollection implements Geometry, Serializable {
    private static final String TYPE = "GeometryCollection";

    @Nullable
    public abstract BoundingBox bbox();

    @NonNull
    public abstract List<Geometry> geometries();

    @NonNull
    public abstract String type();

    public static GeometryCollection fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        gsonBuilder.registerTypeAdapter(Point.class, new PointDeserializer());
        gsonBuilder.registerTypeAdapter(BoundingBox.class, new BoundingBoxDeserializer());
        gsonBuilder.registerTypeAdapter(Geometry.class, new GeometryDeserializer());
        return (GeometryCollection) gsonBuilder.create().fromJson(str, GeometryCollection.class);
    }

    public static GeometryCollection fromGeometries(@NonNull List<Geometry> list) {
        return new AutoValue_GeometryCollection(TYPE, null, list);
    }

    public static GeometryCollection fromGeometries(@NonNull List<Geometry> list, @Nullable BoundingBox boundingBox) {
        return new AutoValue_GeometryCollection(TYPE, boundingBox, list);
    }

    public static GeometryCollection fromGeometry(@NonNull Geometry geometry) {
        return new AutoValue_GeometryCollection(TYPE, null, Arrays.asList(new Geometry[]{geometry}));
    }

    public static GeometryCollection fromGeometry(@NonNull Geometry geometry, @Nullable BoundingBox boundingBox) {
        return new AutoValue_GeometryCollection(TYPE, boundingBox, Arrays.asList(new Geometry[]{geometry}));
    }

    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Point.class, new PointSerializer());
        gsonBuilder.registerTypeAdapter(BoundingBox.class, new BoundingBoxSerializer());
        return gsonBuilder.create().toJson((Object) this);
    }

    public static TypeAdapter<GeometryCollection> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }
}
