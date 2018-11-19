package com.mapbox.geojson.gson;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mapbox.geojson.BoundingBox;
import java.lang.reflect.Type;

public class BoundingBoxSerializer implements JsonSerializer<BoundingBox> {
    public JsonElement serialize(BoundingBox boundingBox, Type type, JsonSerializationContext jsonSerializationContext) {
        type = new JsonArray();
        type.add(new JsonPrimitive(Double.valueOf(boundingBox.southwest().longitude())));
        type.add(new JsonPrimitive(Double.valueOf(boundingBox.southwest().latitude())));
        if (boundingBox.southwest().hasAltitude() != null) {
            type.add(new JsonPrimitive(Double.valueOf(boundingBox.southwest().altitude())));
        }
        type.add(new JsonPrimitive(Double.valueOf(boundingBox.northeast().longitude())));
        type.add(new JsonPrimitive(Double.valueOf(boundingBox.northeast().latitude())));
        if (boundingBox.southwest().hasAltitude() != null) {
            type.add(new JsonPrimitive(Double.valueOf(boundingBox.northeast().altitude())));
        }
        return type;
    }
}
