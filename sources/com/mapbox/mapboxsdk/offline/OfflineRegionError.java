package com.mapbox.mapboxsdk.offline;

public class OfflineRegionError {
    public static final String REASON_CONNECTION = "REASON_CONNECTION";
    public static final String REASON_NOT_FOUND = "REASON_NOT_FOUND";
    public static final String REASON_OTHER = "REASON_OTHER";
    public static final String REASON_SERVER = "REASON_SERVER";
    public static final String REASON_SUCCESS = "REASON_SUCCESS";
    private final String message;
    private final String reason;

    private OfflineRegionError(String str, String str2) {
        this.reason = str;
        this.message = str2;
    }

    public String getReason() {
        return this.reason;
    }

    public String getMessage() {
        return this.message;
    }
}
