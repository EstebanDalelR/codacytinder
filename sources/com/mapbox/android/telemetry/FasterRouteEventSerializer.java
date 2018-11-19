package com.mapbox.android.telemetry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Map.Entry;

class FasterRouteEventSerializer implements JsonSerializer<NavigationFasterRouteEvent> {
    private static final String EVENT = "event";
    private static final String STEP = "step";

    FasterRouteEventSerializer() {
    }

    public JsonElement serialize(NavigationFasterRouteEvent navigationFasterRouteEvent, Type type, JsonSerializationContext jsonSerializationContext) {
        type = new JsonObject();
        type.addProperty(EVENT, navigationFasterRouteEvent.getEvent());
        serializeMetadata(navigationFasterRouteEvent, jsonSerializationContext, type);
        serializeNewData(navigationFasterRouteEvent, jsonSerializationContext, type);
        serializeStep(navigationFasterRouteEvent, jsonSerializationContext, type);
        return type;
    }

    private void serializeMetadata(NavigationFasterRouteEvent navigationFasterRouteEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        for (Entry entry : jsonSerializationContext.serialize(navigationFasterRouteEvent.getMetadata()).getAsJsonObject().entrySet()) {
            jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
        }
    }

    private void serializeNewData(NavigationFasterRouteEvent navigationFasterRouteEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        for (Entry entry : jsonSerializationContext.serialize(navigationFasterRouteEvent.getNavigationNewData()).getAsJsonObject().entrySet()) {
            jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
        }
    }

    private void serializeStep(NavigationFasterRouteEvent navigationFasterRouteEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        jsonObject.add(STEP, jsonSerializationContext.serialize(navigationFasterRouteEvent.getStep()));
    }
}
