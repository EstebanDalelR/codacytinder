package com.mapbox.android.telemetry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Map.Entry;

class RerouteDataSerializer implements JsonSerializer<NavigationRerouteData> {
    private static final String SECOND_SINCE_LAST_REROUTE = "secondsSinceLastReroute";

    RerouteDataSerializer() {
    }

    public JsonElement serialize(NavigationRerouteData navigationRerouteData, Type type, JsonSerializationContext jsonSerializationContext) {
        type = new JsonObject();
        type.addProperty(SECOND_SINCE_LAST_REROUTE, navigationRerouteData.getSecondsSinceLastReroute());
        serializeNewData(navigationRerouteData, jsonSerializationContext, type);
        return type;
    }

    private void serializeNewData(NavigationRerouteData navigationRerouteData, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        for (Entry entry : jsonSerializationContext.serialize(navigationRerouteData.getNavigationNewData()).getAsJsonObject().entrySet()) {
            jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
        }
    }
}
