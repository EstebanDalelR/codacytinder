package com.mapbox.geojson.gson;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mapbox.geojson.Geometry;
import java.lang.reflect.Type;

public class GeometryDeserializer implements JsonDeserializer<Geometry> {
    public Geometry deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement.isJsonObject() != null) {
            type = jsonElement.getAsJsonObject().get("type").getAsString();
        } else {
            type = jsonElement.getAsJsonArray().get(0).getAsJsonObject().get("type").getAsString();
        }
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("com.mapbox.geojson.");
            stringBuilder.append(type);
            return (Geometry) jsonDeserializationContext.deserialize(jsonElement, Class.forName(stringBuilder.toString()));
        } catch (Throwable e) {
            throw new JsonParseException(e);
        }
    }
}
