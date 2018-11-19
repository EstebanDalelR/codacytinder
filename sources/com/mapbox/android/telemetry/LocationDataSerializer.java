package com.mapbox.android.telemetry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

class LocationDataSerializer implements JsonSerializer<NavigationLocationData> {
    private static final String LOCATIONS_AFTER = "locationsAfter";
    private static final String LOCATIONS_BEFORE = "locationsBefore";

    LocationDataSerializer() {
    }

    public JsonElement serialize(NavigationLocationData navigationLocationData, Type type, JsonSerializationContext jsonSerializationContext) {
        type = new JsonObject();
        JsonElement asJsonArray = jsonSerializationContext.serialize(navigationLocationData.getLocationsBefore()).getAsJsonArray();
        navigationLocationData = jsonSerializationContext.serialize(navigationLocationData.getLocationsAfter()).getAsJsonArray();
        type.add(LOCATIONS_BEFORE, asJsonArray);
        type.add(LOCATIONS_AFTER, navigationLocationData);
        return type;
    }
}
