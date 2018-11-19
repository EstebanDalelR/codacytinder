package com.mapbox.android.telemetry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

class FeedbackEventDataSerializer implements JsonSerializer<FeedbackEventData> {
    private static final String AUDIO = "audio";
    private static final String DESCRIPTION = "description";
    private static final String FEEDBACK_TYPE = "feedbackType";
    private static final String SOURCE = "source";
    private static final String USER_ID = "userId";

    FeedbackEventDataSerializer() {
    }

    public JsonElement serialize(FeedbackEventData feedbackEventData, Type type, JsonSerializationContext jsonSerializationContext) {
        type = new JsonObject();
        type.addProperty(FEEDBACK_TYPE, feedbackEventData.getFeedbackType());
        type.addProperty("description", feedbackEventData.getDescription());
        type.addProperty("source", feedbackEventData.getSource());
        type.addProperty("userId", feedbackEventData.getUserId());
        type.addProperty(AUDIO, feedbackEventData.getAudio());
        return type;
    }
}
