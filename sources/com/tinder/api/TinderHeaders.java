package com.tinder.api;

public final class TinderHeaders {
    public static final String ACCEPT_LANGUAGE = "Accept-Language";
    public static final String APP_VERSION = "app-version";
    public static final String OS_VERSION = "os-version";
    public static final String PLATFORM = "platform";
    public static final String SUPPORTED_IMAGE_FORMATS = "x-supported-image-formats";
    public static final String USER_AGENT = "User-Agent";
    public static final String X_AUTH_TOKEN = "X-Auth-Token";
    public static final String X_LOCAL_UTC_OFFSET = "X-Local-UTC-Offset";

    private TinderHeaders() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot instantiate ");
        stringBuilder.append(TinderHeaders.class.getName());
        throw new AssertionError(stringBuilder.toString());
    }
}
