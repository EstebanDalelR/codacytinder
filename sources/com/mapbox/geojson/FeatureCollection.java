package com.mapbox.geojson;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.mapbox.geojson.AutoValue_FeatureCollection.GsonTypeAdapter;
import com.mapbox.geojson.gson.BoundingBoxDeserializer;
import com.mapbox.geojson.gson.BoundingBoxSerializer;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import com.mapbox.geojson.gson.GeometryDeserializer;
import com.mapbox.geojson.gson.PointDeserializer;
import com.mapbox.geojson.gson.PointSerializer;
import java.util.Arrays;
import java.util.List;

@AutoValue
public abstract class FeatureCollection implements GeoJson {
    private static final String TYPE = "FeatureCollection";

    @Nullable
    public abstract BoundingBox bbox();

    @Nullable
    public abstract List<Feature> features();

    @NonNull
    public abstract String type();

    public static FeatureCollection fromJson(@NonNull String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        gsonBuilder.registerTypeAdapter(Point.class, new PointDeserializer());
        gsonBuilder.registerTypeAdapter(Geometry.class, new GeometryDeserializer());
        gsonBuilder.registerTypeAdapter(BoundingBox.class, new BoundingBoxDeserializer());
        return (FeatureCollection) gsonBuilder.create().fromJson(str, FeatureCollection.class);
    }

    public static FeatureCollection fromFeatures(@NonNull Feature[] featureArr) {
        return new AutoValue_FeatureCollection(TYPE, null, Arrays.asList(featureArr));
    }

    public static FeatureCollection fromFeatures(@NonNull List<Feature> list) {
        return new AutoValue_FeatureCollection(TYPE, null, list);
    }

    public static FeatureCollection fromFeatures(@NonNull Feature[] featureArr, @Nullable BoundingBox boundingBox) {
        return new AutoValue_FeatureCollection(TYPE, boundingBox, Arrays.asList(featureArr));
    }

    public static FeatureCollection fromFeatures(@NonNull List<Feature> list, @Nullable BoundingBox boundingBox) {
        return new AutoValue_FeatureCollection(TYPE, boundingBox, list);
    }

    public static FeatureCollection fromFeature(@NonNull Feature feature) {
        return new AutoValue_FeatureCollection(TYPE, null, Arrays.asList(new Feature[]{feature}));
    }

    public static FeatureCollection fromFeature(@NonNull Feature feature, @Nullable BoundingBox boundingBox) {
        return new AutoValue_FeatureCollection(TYPE, boundingBox, Arrays.asList(new Feature[]{feature}));
    }

    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Point.class, new PointSerializer());
        gsonBuilder.registerTypeAdapter(BoundingBox.class, new BoundingBoxSerializer());
        return gsonBuilder.create().toJson((Object) this);
    }

    public static TypeAdapter<FeatureCollection> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }
}
