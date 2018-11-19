package com.mapbox.android.telemetry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Map.Entry;

class FeedbackEventSerializer implements JsonSerializer<NavigationFeedbackEvent> {
    private static final String EVENT = "event";
    private static final String STEP = "step";

    FeedbackEventSerializer() {
    }

    public JsonElement serialize(NavigationFeedbackEvent navigationFeedbackEvent, Type type, JsonSerializationContext jsonSerializationContext) {
        type = new JsonObject();
        type.addProperty(EVENT, navigationFeedbackEvent.getEvent());
        serializeMetadata(navigationFeedbackEvent, jsonSerializationContext, type);
        serializeFeedbackEventData(navigationFeedbackEvent, jsonSerializationContext, type);
        serializeLocationData(navigationFeedbackEvent, jsonSerializationContext, type);
        serializeFeedbackData(navigationFeedbackEvent, jsonSerializationContext, type);
        serializeStep(navigationFeedbackEvent, jsonSerializationContext, type);
        return type;
    }

    private void serializeMetadata(NavigationFeedbackEvent navigationFeedbackEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        for (Entry entry : jsonSerializationContext.serialize(navigationFeedbackEvent.getMetadata()).getAsJsonObject().entrySet()) {
            jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
        }
    }

    private void serializeFeedbackEventData(NavigationFeedbackEvent navigationFeedbackEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        for (Entry entry : jsonSerializationContext.serialize(navigationFeedbackEvent.getFeedbackEventData()).getAsJsonObject().entrySet()) {
            jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
        }
    }

    private void serializeLocationData(NavigationFeedbackEvent navigationFeedbackEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        for (Entry entry : jsonSerializationContext.serialize(navigationFeedbackEvent.getNavigationLocationData()).getAsJsonObject().entrySet()) {
            jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
        }
    }

    private void serializeFeedbackData(NavigationFeedbackEvent navigationFeedbackEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        for (Entry entry : jsonSerializationContext.serialize(navigationFeedbackEvent.getFeedbackData()).getAsJsonObject().entrySet()) {
            jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
        }
    }

    private void serializeStep(NavigationFeedbackEvent navigationFeedbackEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        jsonObject.add(STEP, jsonSerializationContext.serialize(navigationFeedbackEvent.getStep()));
    }
}
