package com.mapbox.geojson;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.mapbox.geojson.AutoValue_Feature.GsonTypeAdapter;
import com.mapbox.geojson.gson.BoundingBoxDeserializer;
import com.mapbox.geojson.gson.BoundingBoxSerializer;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import com.mapbox.geojson.gson.GeometryDeserializer;
import com.mapbox.geojson.gson.PointDeserializer;
import com.mapbox.geojson.gson.PointSerializer;

@AutoValue
public abstract class Feature implements GeoJson {
    private static final String TYPE = "Feature";

    @Nullable
    public abstract BoundingBox bbox();

    @Nullable
    public abstract Geometry geometry();

    @Nullable
    public abstract String id();

    @Nullable
    public abstract JsonObject properties();

    @NonNull
    public abstract String type();

    public static Feature fromJson(@NonNull String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        gsonBuilder.registerTypeAdapter(Point.class, new PointDeserializer());
        gsonBuilder.registerTypeAdapter(BoundingBox.class, new BoundingBoxDeserializer());
        gsonBuilder.registerTypeAdapter(Geometry.class, new GeometryDeserializer());
        return (Feature) gsonBuilder.create().fromJson(str, Feature.class);
    }

    public static Feature fromGeometry(@Nullable Geometry geometry) {
        return new AutoValue_Feature(TYPE, null, null, geometry, new JsonObject());
    }

    public static Feature fromGeometry(@Nullable Geometry geometry, @Nullable BoundingBox boundingBox) {
        return new AutoValue_Feature(TYPE, boundingBox, null, geometry, new JsonObject());
    }

    public static Feature fromGeometry(@Nullable Geometry geometry, @NonNull JsonObject jsonObject) {
        return new AutoValue_Feature(TYPE, null, null, geometry, jsonObject);
    }

    public static Feature fromGeometry(@Nullable Geometry geometry, @NonNull JsonObject jsonObject, @Nullable BoundingBox boundingBox) {
        return new AutoValue_Feature(TYPE, boundingBox, null, geometry, jsonObject);
    }

    public static Feature fromGeometry(@Nullable Geometry geometry, @NonNull JsonObject jsonObject, @Nullable String str) {
        return new AutoValue_Feature(TYPE, null, str, geometry, jsonObject);
    }

    public static Feature fromGeometry(@Nullable Geometry geometry, @NonNull JsonObject jsonObject, @Nullable String str, @Nullable BoundingBox boundingBox) {
        return new AutoValue_Feature(TYPE, boundingBox, str, geometry, jsonObject);
    }

    public String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Point.class, new PointSerializer());
        gsonBuilder.registerTypeAdapter(BoundingBox.class, new BoundingBoxSerializer());
        return gsonBuilder.create().toJson((Object) this);
    }

    public static TypeAdapter<Feature> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public void addStringProperty(String str, String str2) {
        properties().addProperty(str, str2);
    }

    public void addNumberProperty(String str, Number number) {
        properties().addProperty(str, number);
    }

    public void addBooleanProperty(String str, Boolean bool) {
        properties().addProperty(str, bool);
    }

    public void addCharacterProperty(String str, Character ch) {
        properties().addProperty(str, ch);
    }

    public void addProperty(String str, JsonElement jsonElement) {
        properties().add(str, jsonElement);
    }

    public String getStringProperty(String str) {
        return properties().get(str).getAsString();
    }

    public Number getNumberProperty(String str) {
        return properties().get(str).getAsNumber();
    }

    public Boolean getBooleanProperty(String str) {
        return Boolean.valueOf(properties().get(str).getAsBoolean());
    }

    public Character getCharacterProperty(String str) {
        return Character.valueOf(properties().get(str).getAsCharacter());
    }

    public JsonElement getProperty(String str) {
        return properties().get(str);
    }

    public JsonElement removeProperty(String str) {
        return properties().remove(str);
    }

    public boolean hasProperty(String str) {
        return properties().has(str);
    }

    public boolean hasNonNullValueForProperty(String str) {
        return (hasProperty(str) && getProperty(str).isJsonNull() == null) ? true : null;
    }
}
