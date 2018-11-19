package com.mapbox.android.telemetry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Map.Entry;

class CancelEventSerializer implements JsonSerializer<NavigationCancelEvent> {
    private static final String EVENT = "event";

    CancelEventSerializer() {
    }

    public JsonElement serialize(NavigationCancelEvent navigationCancelEvent, Type type, JsonSerializationContext jsonSerializationContext) {
        type = new JsonObject();
        type.addProperty(EVENT, navigationCancelEvent.getEvent());
        serializeCancelData(navigationCancelEvent, jsonSerializationContext, type);
        serializeMetadata(navigationCancelEvent, jsonSerializationContext, type);
        return type;
    }

    private void serializeCancelData(NavigationCancelEvent navigationCancelEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        for (Entry entry : jsonSerializationContext.serialize(navigationCancelEvent.getCancelData()).getAsJsonObject().entrySet()) {
            jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
        }
    }

    private void serializeMetadata(NavigationCancelEvent navigationCancelEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        for (Entry entry : jsonSerializationContext.serialize(navigationCancelEvent.getMetadata()).getAsJsonObject().entrySet()) {
            jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
        }
    }
}
