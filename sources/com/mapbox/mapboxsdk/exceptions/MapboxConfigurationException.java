package com.mapbox.mapboxsdk.exceptions;

public class MapboxConfigurationException extends RuntimeException {
    public MapboxConfigurationException() {
        super("\nUsing MapView requires setting a valid access token. Use Mapbox.getInstance(Context context, String accessToken) to provide one. \nPlease see https://www.mapbox.com/help/create-api-access-token/ to learn how to create one.\nMore information in this guide https://www.mapbox.com/help/first-steps-android-sdk/#access-tokens.");
    }
}
