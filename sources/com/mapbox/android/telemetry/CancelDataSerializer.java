package com.mapbox.android.telemetry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

class CancelDataSerializer implements JsonSerializer<NavigationCancelData> {
    private static final String ARRIVAL_TIMESTAMP = "arrivalTimestamp";
    private static final String COMMENT = "comment";
    private static final String RATING = "rating";

    CancelDataSerializer() {
    }

    public JsonElement serialize(NavigationCancelData navigationCancelData, Type type, JsonSerializationContext jsonSerializationContext) {
        type = new JsonObject();
        type.addProperty(COMMENT, navigationCancelData.getComment());
        type.addProperty("rating", navigationCancelData.getRating());
        type.addProperty(ARRIVAL_TIMESTAMP, navigationCancelData.getArrivalTimestamp());
        return type;
    }
}
