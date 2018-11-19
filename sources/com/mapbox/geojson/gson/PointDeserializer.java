package com.mapbox.geojson.gson;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.mapbox.geojson.Point;
import java.lang.reflect.Type;

public class PointDeserializer implements JsonDeserializer<Point> {
    public Point deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement.isJsonObject() != null) {
            jsonElement = jsonElement.getAsJsonObject().getAsJsonArray("coordinates");
        } else {
            jsonElement = jsonElement.getAsJsonArray();
        }
        double asDouble = jsonElement.get(null).getAsDouble();
        double asDouble2 = jsonElement.get(1).getAsDouble();
        if (jsonElement.size() > 2) {
            return Point.fromLngLat(asDouble, asDouble2, jsonElement.get(2).getAsDouble());
        }
        return Point.fromLngLat(asDouble, asDouble2);
    }
}
