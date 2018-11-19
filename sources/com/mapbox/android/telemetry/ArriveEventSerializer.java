package com.mapbox.android.telemetry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Map.Entry;

class ArriveEventSerializer implements JsonSerializer<NavigationArriveEvent> {
    private static final String EVENT = "event";

    ArriveEventSerializer() {
    }

    public JsonElement serialize(NavigationArriveEvent navigationArriveEvent, Type type, JsonSerializationContext jsonSerializationContext) {
        type = new JsonObject();
        type.addProperty(EVENT, navigationArriveEvent.getEvent());
        serializeMetadata(navigationArriveEvent, jsonSerializationContext, type);
        return type;
    }

    private void serializeMetadata(NavigationArriveEvent navigationArriveEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        for (Entry entry : jsonSerializationContext.serialize(navigationArriveEvent.getMetadata()).getAsJsonObject().entrySet()) {
            jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
        }
    }
}
