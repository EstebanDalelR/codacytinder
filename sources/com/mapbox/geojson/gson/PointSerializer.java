package com.mapbox.geojson.gson;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mapbox.geojson.Point;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class PointSerializer implements JsonSerializer<Point> {
    public JsonElement serialize(Point point, Type type, JsonSerializationContext jsonSerializationContext) {
        type = new JsonArray();
        jsonSerializationContext = BigDecimal.valueOf(point.latitude()).setScale(7, RoundingMode.HALF_UP).stripTrailingZeros().toPlainString();
        type.add(new JsonPrimitive(Double.valueOf(BigDecimal.valueOf(point.longitude()).setScale(7, RoundingMode.HALF_UP).stripTrailingZeros().toPlainString())));
        type.add(new JsonPrimitive(Double.valueOf(jsonSerializationContext)));
        if (point.hasAltitude() != null) {
            type.add(new JsonPrimitive(Double.valueOf(point.altitude())));
        }
        return type;
    }
}
