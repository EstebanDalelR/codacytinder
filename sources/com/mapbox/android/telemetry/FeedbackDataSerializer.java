package com.mapbox.android.telemetry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

class FeedbackDataSerializer implements JsonSerializer<FeedbackData> {
    private static final String FEEDBACK_ID = "feedbackId";
    private static final String SCREENSHOT = "screenshot";

    FeedbackDataSerializer() {
    }

    public JsonElement serialize(FeedbackData feedbackData, Type type, JsonSerializationContext jsonSerializationContext) {
        type = new JsonObject();
        type.addProperty(FEEDBACK_ID, feedbackData.getFeedbackId());
        type.addProperty(SCREENSHOT, feedbackData.getScreenshot());
        return type;
    }
}
