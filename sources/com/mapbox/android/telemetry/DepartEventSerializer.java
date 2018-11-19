package com.mapbox.android.telemetry;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

class DepartEventSerializer implements JsonSerializer<NavigationDepartEvent> {
    private static final String EVENT = "event";

    DepartEventSerializer() {
    }

    public JsonElement serialize(NavigationDepartEvent navigationDepartEvent, Type type, JsonSerializationContext jsonSerializationContext) {
        type = jsonSerializationContext.serialize(navigationDepartEvent.getMetadata()).getAsJsonObject();
        type.addProperty(EVENT, navigationDepartEvent.getEvent());
        return type;
    }
}
