package com.mapbox.android.telemetry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

class NavigationMetadataSerializer implements JsonSerializer<NavigationMetadata> {
    private static final String ABSOLUTE_DISTANCE_TO_DESTINATION = "absoluteDistanceToDestination";
    private static final String APPLICATION_STATE = "applicationState";
    private static final String AUDIO_TYPE = "audioType";
    private static final String BATTERY_LEVEL = "batteryLevel";
    private static final String BATTERY_PLUGGED_IN = "batteryPluggedIn";
    private static final String CONNECTIVITY = "connectivity";
    private static final String CREATED = "created";
    private static final String DEVICE = "device";
    private static final String DISTANCE_COMPLETED = "distanceCompleted";
    private static final String DISTANCE_REMAINING = "distanceRemaining";
    private static final String DURATION_REMAINING = "durationRemaining";
    private static final String ESTIMATED_DISTANCE = "estimatedDistance";
    private static final String ESTIMATED_DURATION = "estimatedDuration";
    private static final String EVENT_VERSION = "eventVersion";
    private static final String GEOMETRY = "geometry";
    private static final String LATITUDE = "lat";
    private static final String LOCATION_ENGINE = "locationEngine";
    private static final String LONGITUDE = "lng";
    private static final String OPERATING_SYSTEM = "operatingSystem";
    private static final String ORIGINAL_ESTIMATED_DISTANCE = "originalEstimatedDistance";
    private static final String ORIGINAL_ESTIMATED_DURATION = "originalEstimatedDuration";
    private static final String ORIGINAL_GEOMETRY = "originalGeometry";
    private static final String ORIGINAL_REQUEST_IDENTIFIER = "originalRequestIdentifier";
    private static final String ORIGINAL_STEP_COUNT = "originalStepCount";
    private static final String PERCENT_TIME_IN_FOREGROUND = "percentTimeInForeground";
    private static final String PERCENT_TIME_IN_PORTRAIT = "percentTimeInPortrait";
    private static final String PROFILE = "profile";
    private static final String REQUEST_IDENTIFIER = "requestIdentifier";
    private static final String REROUTE_COUNT = "rerouteCount";
    private static final String SCREEN_BRIGHTNESS = "screenBrightness";
    private static final String SDK_IDENTIFIER = "sdKIdentifier";
    private static final String SDK_VERSION = "sdkVersion";
    private static final String SESSION_IDENTIFIER = "sessionIdentifier";
    private static final String SIMULATION = "simulation";
    private static final String START_TIMESTAMP = "startTimestamp";
    private static final String STEP_COUNT = "stepCount";
    private static final String VOLUME_LEVEL = "volumeLevel";

    NavigationMetadataSerializer() {
    }

    public JsonElement serialize(NavigationMetadata navigationMetadata, Type type, JsonSerializationContext jsonSerializationContext) {
        type = new JsonObject();
        serializeRequired(navigationMetadata, type);
        serializeOptional(navigationMetadata, type);
        return type;
    }

    private void serializeRequired(NavigationMetadata navigationMetadata, JsonObject jsonObject) {
        jsonObject.addProperty(START_TIMESTAMP, navigationMetadata.getStartTimestamp());
        jsonObject.addProperty(DISTANCE_COMPLETED, navigationMetadata.getDistanceCompleted());
        jsonObject.addProperty(DISTANCE_REMAINING, navigationMetadata.getDistanceRemaining());
        jsonObject.addProperty(DURATION_REMAINING, navigationMetadata.getDurationRemaining());
        jsonObject.addProperty(OPERATING_SYSTEM, navigationMetadata.getOperatingSystem());
        jsonObject.addProperty(EVENT_VERSION, Integer.valueOf(navigationMetadata.getEventVersion()));
        jsonObject.addProperty(SDK_IDENTIFIER, navigationMetadata.getSdKIdentifier());
        jsonObject.addProperty(SDK_VERSION, navigationMetadata.getSdkVersion());
        jsonObject.addProperty(SESSION_IDENTIFIER, navigationMetadata.getSessionIdentifier());
        jsonObject.addProperty("lat", Double.valueOf(navigationMetadata.getLat()));
        jsonObject.addProperty(LONGITUDE, Double.valueOf(navigationMetadata.getLng()));
        jsonObject.addProperty(GEOMETRY, navigationMetadata.getGeometry());
        jsonObject.addProperty(PROFILE, navigationMetadata.getProfile());
        jsonObject.addProperty(SIMULATION, Boolean.valueOf(navigationMetadata.isSimulation()));
        jsonObject.addProperty(DEVICE, navigationMetadata.getDevice());
        jsonObject.addProperty(LOCATION_ENGINE, navigationMetadata.getLocationEngine());
        jsonObject.addProperty(CREATED, navigationMetadata.getCreated());
        jsonObject.addProperty(ABSOLUTE_DISTANCE_TO_DESTINATION, Integer.valueOf(navigationMetadata.getAbsoluteDistanceToDestination()));
    }

    private void serializeOptional(NavigationMetadata navigationMetadata, JsonObject jsonObject) {
        jsonObject.addProperty(ESTIMATED_DISTANCE, navigationMetadata.getEstimatedDistance());
        jsonObject.addProperty(ESTIMATED_DURATION, navigationMetadata.getEstimatedDuration());
        jsonObject.addProperty(REROUTE_COUNT, navigationMetadata.getRerouteCount());
        jsonObject.addProperty(ORIGINAL_REQUEST_IDENTIFIER, navigationMetadata.getOriginalRequestIdentifier());
        jsonObject.addProperty(REQUEST_IDENTIFIER, navigationMetadata.getRequestIdentifier());
        jsonObject.addProperty(ORIGINAL_GEOMETRY, navigationMetadata.getOriginalGeometry());
        jsonObject.addProperty(ORIGINAL_ESTIMATED_DISTANCE, navigationMetadata.getOriginalEstimatedDistance());
        jsonObject.addProperty(ORIGINAL_ESTIMATED_DURATION, navigationMetadata.getOriginalEstimatedDuration());
        jsonObject.addProperty(AUDIO_TYPE, navigationMetadata.getAudioType());
        jsonObject.addProperty(STEP_COUNT, navigationMetadata.getStepCount());
        jsonObject.addProperty(ORIGINAL_STEP_COUNT, navigationMetadata.getOriginalStepCount());
        jsonObject.addProperty(VOLUME_LEVEL, navigationMetadata.getVolumeLevel());
        jsonObject.addProperty(SCREEN_BRIGHTNESS, navigationMetadata.getScreenBrightness());
        jsonObject.addProperty(APPLICATION_STATE, navigationMetadata.getApplicationState());
        jsonObject.addProperty(BATTERY_PLUGGED_IN, navigationMetadata.isBatteryPluggedIn());
        jsonObject.addProperty(BATTERY_LEVEL, navigationMetadata.getBatteryLevel());
        jsonObject.addProperty(CONNECTIVITY, navigationMetadata.getConnectivity());
        jsonObject.addProperty(PERCENT_TIME_IN_PORTRAIT, navigationMetadata.getPercentTimeInPortrait());
        jsonObject.addProperty(PERCENT_TIME_IN_FOREGROUND, navigationMetadata.getPercentTimeInForeground());
    }
}
