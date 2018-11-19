package com.mapbox.android.telemetry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Map.Entry;

class RerouteEventSerializer implements JsonSerializer<NavigationRerouteEvent> {
    private static final String EVENT = "event";
    private static final String STEP = "step";

    RerouteEventSerializer() {
    }

    public JsonElement serialize(NavigationRerouteEvent navigationRerouteEvent, Type type, JsonSerializationContext jsonSerializationContext) {
        type = new JsonObject();
        type.addProperty(EVENT, navigationRerouteEvent.getEvent());
        serializeMetadata(navigationRerouteEvent, jsonSerializationContext, type);
        serializeRerouteData(navigationRerouteEvent, jsonSerializationContext, type);
        serializeLocationData(navigationRerouteEvent, jsonSerializationContext, type);
        serializeFeedbackData(navigationRerouteEvent, jsonSerializationContext, type);
        serializeStep(navigationRerouteEvent, jsonSerializationContext, type);
        return type;
    }

    private void serializeMetadata(NavigationRerouteEvent navigationRerouteEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        for (Entry entry : jsonSerializationContext.serialize(navigationRerouteEvent.getNavigationMetadata()).getAsJsonObject().entrySet()) {
            jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
        }
    }

    private void serializeRerouteData(NavigationRerouteEvent navigationRerouteEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        for (Entry entry : jsonSerializationContext.serialize(navigationRerouteEvent.getNavigationRerouteData()).getAsJsonObject().entrySet()) {
            jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
        }
    }

    private void serializeLocationData(NavigationRerouteEvent navigationRerouteEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        for (Entry entry : jsonSerializationContext.serialize(navigationRerouteEvent.getNavigationLocationData()).getAsJsonObject().entrySet()) {
            jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
        }
    }

    private void serializeFeedbackData(NavigationRerouteEvent navigationRerouteEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        for (Entry entry : jsonSerializationContext.serialize(navigationRerouteEvent.getFeedbackData()).getAsJsonObject().entrySet()) {
            jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
        }
    }

    private void serializeStep(NavigationRerouteEvent navigationRerouteEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        jsonObject.add(STEP, jsonSerializationContext.serialize(navigationRerouteEvent.getStep()));
    }
}
