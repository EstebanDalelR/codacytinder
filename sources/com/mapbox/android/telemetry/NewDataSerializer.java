package com.mapbox.android.telemetry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

class NewDataSerializer implements JsonSerializer<NavigationNewData> {
    private static final String NEW_DISTANCE_REMAINING = "newDistanceRemaining";
    private static final String NEW_DURATION_REMAINING = "newDurationRemaining";
    private static final String NEW_GEOMETRY = "newGeometry";

    NewDataSerializer() {
    }

    public JsonElement serialize(NavigationNewData navigationNewData, Type type, JsonSerializationContext jsonSerializationContext) {
        type = new JsonObject();
        type.addProperty(NEW_DISTANCE_REMAINING, navigationNewData.getNewDistanceRemaining());
        type.addProperty(NEW_DURATION_REMAINING, navigationNewData.getNewDurationRemaining());
        type.addProperty(NEW_GEOMETRY, navigationNewData.getNewGeometry());
        return type;
    }
}
